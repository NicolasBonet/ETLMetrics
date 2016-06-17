package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.epsilon.emc.emf.EmfModel;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import static java.nio.file.StandardCopyOption.*;

public class Controller {

    @FXML
    private BarChart chart;

    @FXML
    private Label caption;
    @FXML
    private TextField rutabaseweb;
    @FXML
    private TextField rutamodelo;
    @FXML
    private TextField rutabasejee;

    private  int ejecuciones = 0;

    private void replaceInFile(String fileOrigen, String fileDestino, String key, String valor) throws Exception {
        Path path = Paths.get(fileOrigen);
        Path pathD = Paths.get(fileDestino);
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        content = content.replaceAll(key, valor);
        Files.write(pathD, content.getBytes(charset));
    }

    void cleanDirectory(File dir) {
        for (File file: dir.listFiles()) {
            if (file.isDirectory()) cleanDirectory(file);
            file.delete();
        }
    }

    @FXML
    protected void procesar(ActionEvent event) {
        System.out.println("Procesando el archivo!!!");


        try {
            ejecuciones++;
            replaceInFile("./transformations/M2T/SaveWEBBase.egl", "./transformations/M2T/SaveWEB.egl", "<<-rutabaseweb->>", this.rutabaseweb.getText());
            replaceInFile("./transformations/M2T/SaveNegocioBase.egl", "./transformations/M2T/SaveNegocio.egl", "<<-rutabasejee->>", this.rutabasejee.getText());
            Files.copy(Paths.get(this.rutamodelo.getText()), Paths.get("./modelo" + ejecuciones + ".xmi"), REPLACE_EXISTING);

            chart.getData().removeAll();
            cleanDirectory(new File("./modelosgenerados"));


            //XYChart.Series antes = this.generateFromCode(new String[]{this.rutabasejee.getText(),this.rutabaseweb.getText()}, "Antes");

            //chart.getData().addAll(antes);


            File buildFile = new File("build.xml");
            Project p = new Project();
            DefaultLogger consoleLogger = new DefaultLogger();
            consoleLogger.setErrorPrintStream(System.err);
            consoleLogger.setOutputPrintStream(System.out);
            consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
            p.addBuildListener(consoleLogger);

            p.setProperty("rutamodelo",new File("./modelo" + ejecuciones + ".xmi").getAbsolutePath());
            p.setUserProperty("ant.file", buildFile.getAbsolutePath());
            p.init();
            ProjectHelper helper = ProjectHelper.getProjectHelper();

            p.addReference("ant.projectHelper", helper);
            helper.parse(p, buildFile);
            p.executeTarget(p.getDefaultTarget());

            XYChart.Series despues = this.generateFromCode(new String[]{this.rutabasejee.getText(),this.rutabaseweb.getText()+"/scripts",this.rutabaseweb.getText()+"/views",this.rutabaseweb.getText()+"/index.html"}, "Despues");

            chart.getData().addAll(despues);

            chart.getXAxis().setAutoRanging(true);
            chart.getYAxis().setAutoRanging(true);

            Files.delete(Paths.get("./modelo" + ejecuciones+ ".xmi"));



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private XYChart.Series generateFromCode(String[] rutas, String name) throws Exception {

        XYChart.Series series1 = null;

        if (series1 == null) {
            series1 = new XYChart.Series();
            series1.setName(name);
        }

        for (LineaCodigo loc : this.contarLineas(rutas)) {
            series1.getData().add(new XYChart.Data(loc.getLenguaje(), loc.getLoc()));
        }

        return series1;

    }

    private ArrayList<LineaCodigo> contarLineas(String[] rutas) throws Exception {
        ArrayList<LineaCodigo> locs = new ArrayList<LineaCodigo>();



        locs.add(new LineaCodigo("Java"));
        locs.add(new LineaCodigo("Javascript"));
        locs.add(new LineaCodigo("HTML"));

        for (String ruta : rutas) {

            Process pr = Runtime.getRuntime().exec("cloc " + ruta);
            pr.waitFor();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(pr.getInputStream()));

            StringBuilder sb = new StringBuilder();

            String line = "";
            int indice = 0;
            boolean procesar = false;


            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if (line.startsWith("Language")) {
                    indice++;
                    continue;
                } else if (line.startsWith("----") && !procesar && indice > 0) {
                    procesar = true;
                    continue;
                } else if (line.startsWith("----") && procesar) {
                    procesar = false;
                    break;
                }

                if (procesar) {
                    String[] linea = line.replaceAll("\\s+", " ").split(" ");

                    Optional<LineaCodigo> _loc = locs.stream().filter(l -> l.getLenguaje().equals(linea[0])).findFirst();
                    LineaCodigo loc = null;
                    if (_loc.isPresent()) {
                        loc = _loc.get();
                        loc.setLoc(loc.getLoc() + Integer.parseInt(linea[4]));
                    }



                }
            }

        }


        return locs;
    }


}

