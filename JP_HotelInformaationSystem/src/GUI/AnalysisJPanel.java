/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author yizhe
 */
import java.awt.BorderLayout;  
import java.awt.FlowLayout;  
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
  
import javax.swing.BorderFactory;  
import javax.swing.JCheckBox;  
import javax.swing.JPanel;  
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;  
  

public class AnalysisJPanel extends JPanel {  
  
  public AnalysisJPanel() {  
    super(new BorderLayout());  
    JPanel webBrowserPanel = new JPanel(new BorderLayout());  
    webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Visualization-by Power BI"));  
    final JWebBrowser webBrowser = new JWebBrowser();  
    String url="https://app.powerbi.com/view?r=eyJrIjoiMGJiOWI3ODEtNDBlYy00ZjQzLTg3Y2YtZDVjYmI3YTllMjNjIiwidCI6ImE4ZWVjMjgxLWFhYTMtNGRhZS1hYzliLTlhMzk4YjkyMTVlNyIsImMiOjN9";
    String url3="https://app.powerbi.com/view?r=eyJrIjoiZTlmN2I0MjctNTVlNi00NDc0LThjMzktMDY4ZjFhY2UwNGU2IiwidCI6ImE4ZWVjMjgxLWFhYTMtNGRhZS1hYzliLTlhMzk4YjkyMTVlNyIsImMiOjN9";
    String url2="http://www.google.com";
    webBrowser.navigate(url3);
    webBrowserPanel.add(webBrowser, BorderLayout.CENTER);  
    add(webBrowserPanel, BorderLayout.CENTER);  
    // Create an additional bar allowing to show/hide the menu bar of the web browser.  
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));  
    JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());  
    menuBarCheckBox.addItemListener(new ItemListener() {  
      public void itemStateChanged(ItemEvent e) {  
        webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);  
      }  
    });  
    buttonPanel.add(menuBarCheckBox);  
    add(buttonPanel, BorderLayout.SOUTH);  
  }  
  
  /* Standard main method to try that test as a standalone application. */  
//  public static void main(String[] args) {  
//    UIUtils.setPreferredLookAndFeel();  
//    NativeInterface.open();  
//    SwingUtilities.invokeLater(new Runnable() {  
//      public void run() {  
//        JFrame frame = new JFrame("DJ Native Swing Test");  
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//        frame.getContentPane().add(new AnalysisJPanel(), BorderLayout.CENTER);  
//        frame.setSize(800, 600);  
//        frame.setLocationByPlatform(true);  
//        frame.setVisible(true);  
//      }  
//    });  
//    NativeInterface.runEventPump();  
//  }  
  
}  