// Libraries
var gulp = require('gulp');
var expect = require('gulp-expect-file');
var concat = require('gulp-concat');
var sass = require('gulp-sass');


// Tasks
var vendorStyles = 'vendor-styles';
var vendorScripts ='vendor-scripts';
var scripts ='scripts';
var styles ='styles';

gulp.task(vendorStyles, function () {
    var files = [
        'bower_components/bootstrap/dist/css/bootstrap.min.css',
    ];
    gulp.src(files)
    .pipe(expect(files))
    .pipe(gulp.dest('Angular/css/vendor'))
    .pipe(gulp.dest('PHP/css/vendor'));
});

gulp.task(vendorScripts, function () {
    var files = [
        'bower_components/jquery/dist/jquery.js',
        'bower_components/bootstrap/dist/js/bootstrap.js',
        'bower_components/angular/angular.js',
        'bower_components/angular-ui-router/release/angular-ui-router.js'
    ];
    gulp.src(files)
    .pipe(expect(files))
    .pipe(concat('angular.js'))
    .pipe(gulp.dest('app/scripts/vendor'));

    files = 'app/scripts/vendor/**/*.js';
    gulp.src(files)
    .pipe(expect(files))
    .pipe(gulp.dest('app/scripts/vendor'));
});

gulp.task(scripts, function () {
    var files = [
        'app/controllers/*.js'
    ];
    gulp.src(files)
    .pipe(expect(files))
    .pipe(concat('controllers.js'))
    .pipe( gulp.dest('app/scripts/auto') );

    files = [
        'app/services/*.js'
    ];
    gulp.src(files)
    .pipe(expect(files))
    .pipe(concat('services.js'))
    .pipe( gulp.dest('app/scripts/auto') );
});

gulp.task(styles, function () {
    var files = [
        'app/styles/**/*.scss'
    ];
    gulp.src(files)
    .pipe(expect(files))
    .pipe(concat('main.css'))
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('app/styles/auto'))
});

gulp.task('watch', function () {
    // var scriptsFiles = [
    //     scriptsPath
    // ];
    // gulp.watch(scriptsFiles, [scripts]);

    var styleSheetsFiles = [
        'app/styles/**/*.scss'
    ];
    gulp.watch(styleSheetsFiles, [styles]);
});

gulp.task('default', [vendorStyles, vendorScripts, scripts, styles]);
