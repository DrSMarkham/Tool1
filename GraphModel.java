
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;
 
//create class and extend with JFrame
public class GraphModel extends JFrame 
{
	//declare variable
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	//main method
	public static void main(String[] args) 
	{
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				//
                            
                            try 
				                             
                                
                            {
					//Create object of NewWindow
				//	NewWindow1 frame = new NewWindow1();
					//set frame visible true
				//	frame.setVisible(false);					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public GraphModel() //constructor
	{
		//set frame title
		//setTitle("Semantic Plan Representation");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		//setBounds(200, 200, 450, 300);
		
		//create object of JPanel
		//contentPane = new JPanel();
		//set border
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		//setContentPane(contentPane);
		//set null
		//contentPane.setLayout(null);
                
                JTextArea textArea = new JTextArea(100, 100);
                
                //JTextArea ta = new JTextArea(100, 100);
    textArea.setText(
               // "Semantic Plan Representation Tool\n" + "\n" +
    " uDraw(Graph) is a universal, generic visualization system for automatic generation of high-quality drawings of directed graphs. Graphs are widely" + "\n" +
    "used representations to show objects (\"nodes\") and relationships (\"edges\") between them. They are used to visualize hierarchies," + "\n" +
    "dependency structures, networks, configurations, dataflows, etc." + "\n" +
        " The base window is the central place where graphs are visualized. In a base window you can open a new view of the current graph" + "\n" +
    "(i.e. another base window) by using menu View/Open New View. When two or more base windows are open at a time, you can close one of them with" + "\n" +
    "menu File/Close without terminating the system. To exit from any base window, select menu File/Exit." + "\n" +
            "After loading a graph from file, it will be displayed in the graph area of the base window. If the graph exceeds the size of the window," + "\n" +
            "the horizontal and vertical scrollbar can be used to adjust the currently visible area (2D-scrolling is possible by dragging with the" + "\n" +
            "middle mouse button, if available). In the footer area, system messages are displayed, e.g. the status of an operation." + " \n" +
"The pull down menus are used to start operations in uDraw(Graph). Menus can be selected either with the mouse or triggered by using the keyboard." + "\n" +
            "The following menus are available in uDraw(Graph): \n" +
"•	File Menu \n" +
"•	Edit Menu \n" +
"•	View Menu \n" +
"•	Navigation Menu \n" +
"•	Abstraction Menu \n" +
"•	Layout Menu \n" +
"•	Options Menu \n" +
"•	Help Menu "
    );
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Graph-Theoretic Model of Plan");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setLayout(new BorderLayout());
                //frame.add(scrollPane);
                frame.setSize(100, 100);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
		
		//label in the frame
		//JLabel lblWelcome = new JLabel("Welcome this is New Frame");
		//set fore ground color to the label
		//lblWelcome.setForeground(Color.RED);
		//set font to the label
	//lblWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		//set bounds of the label
		//lblWelcome.setBounds(75, 100, 294, 32);
		//add label to the contentPane 
		//contentPane.add(lblWelcome
                
                //JPanel inputpanel = new JPanel();
                //inputpanel.setLayout(new FlowLayout());
                //JTextField input = new JTextField(20);
                //JButton button = new JButton("Continue");
                //DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                //caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                //inputpanel.add(scroller);
                //inputpanel.add(input);
                //inputpanel.add(button);
                //contentPane.add(inputpanel);
                //frame.getContentPane().add(BorderLayout.CENTER, contentPane);
                //frame.pack();
                //frame.setLocationByPlatform(true);
                //frame.setVisible(true);
                //frame.setResizable(false);
                //input.requestFocus();
                
                JButton btnNewFrame1 = new JButton("Continue");
		//add actionListener
		btnNewFrame1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				GraphModel1 frame = new GraphModel1();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame1.setBounds(150, 650, 108, 25);
                
                //JButton btnNewFramea = new JButton("Deploy Tool");
		//add actionListener
		//btnNewFramea.addActionListener(new ActionListener()
		//{
			//public void actionPerformed(ActionEvent arg0)
			//{
				//call the object of NewWindow and set visible true
				//NewWindow6 frame = new NewWindow6();
				//frame.setVisible(true);
				//set default close operation
				
                                
                                //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            //new PlanToolPBA();
			//}
		//});
                //btnNewFramea.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		//btnNewFramea.setBounds(280, 650, 178, 25);
                
                
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame1);
                //textArea.add(btnNewFramea);
                frame.pack();
                frame.setVisible(true);
		((AbstractDocument)textArea.getDocument()).dump(System.out);
    
    
                
                
//public class PlanJavaDON {
  //public static void main(String[] args) {
    //try {
    //    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //} catch (Exception evt) {}
  
    //JFrame f = new JFrame("Smantic Plan Representation Tool");
    //JTextArea ta = new JTextArea(100, 100);
    //ta.setText(
    //            "Semantic Plan Representation Tool\n" + "\n" +
    
//"logic expression.  Actions can only be performed through rules.\n" + "\n" 
//    );
    //frame.getContentPane().add(ta);
    //contentPane.add(ta);
    //contentPane.pack();
    //contentPane.setVisible(true);

    //((AbstractDocument)ta.getDocument()).dump(System.out);
	}
}






//public TestScrollPane03() {
        //EventQueue.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                
          //  }
        //});
    //} 