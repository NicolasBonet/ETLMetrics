using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Phone.UI.Input;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkID=390556

namespace TotalWar
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class PrusiaArmy: Page
    {
        public PrusiaArmy()
        {
            this.InitializeComponent();
            HardwareButtons.BackPressed += HardwareButtons_BackPressed;
        }

        /// <summary>
        /// Invoked when this page is about to be displayed in a Frame.
        /// </summary>
        /// <param name="e">Event data that describes how this page was reached.
        /// This parameter is typically used to configure the page.</param>
        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
        }
        
 private void PrussianJaegers_Click(object sender, RoutedEventArgs e)
        {
			Frame.Navigate(typeof(PrussianJaegers));
        }
 private void Landwehr_Click(object sender, RoutedEventArgs e)
        {
			Frame.Navigate(typeof(Landwehr));
        }
 private void LifeGuard_Click(object sender, RoutedEventArgs e)
        {
			Frame.Navigate(typeof(LifeGuard));
        }
void HardwareButtons_BackPressed(object sender, BackPressedEventArgs e)
{
    Frame frame = Window.Current.Content as Frame;
    if (frame == null)
    {
        return;
    }
    if (frame.CanGoBack)
    {
        frame.GoBack();
        e.Handled = true;
    }
}
    }
}