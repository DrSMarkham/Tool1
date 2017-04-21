
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;
 
//create class and extend with JFrame
public class NewWindowSem extends JFrame 
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
	public NewWindowSem() //constructor
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
" Semantic Plan Representation Tool\n" + "\n" +
     " An ontology is an attempt to formulate an exhaustive and rigorous" + "\n" +
"conceptual scheme within a given domain. Although this is typically a " + "\n" +
"hierarchical data containing all the relevant entries, it is not " + "\n" +
"necessarily a tree. In addition to the entities, the ontology contains \n" +
"relationships and rules (such as theorems and regulations) within that \n" +
"domain. Therefore a taxonomy is a subset of an ontology.\n" +
"The Semantic Plan Representation Tool deploys a frame-based military \n" +
"campaign ontology to capture experiential learning gained during the execution\n" +
"of military plans, in an organized and accessible form. We will use the\\n\" +\n" +
"following frames:\n" + "\n" +
"Military Campaign\n" +
"Operation\n" +
"ActionsAnticipated\n" +
"ActionsExecuted \n" +
"\n" +
"Each frame will have associated attributes:\n" + "\n" +
"Military Campaign\n" + "\n" +
"i)	objectives \n" +
"ii)	area of operations \n" +
"iii)	mission type\n" +"\n" +
"Operation\n" + "\n" +
"i)	objectives \n" +
"ii)	area of operations \n" +
"iii)	operation type\n" +
"iv)	operational environment \n" +
"v)	commanders intent \n" + "\n" +
" The ActionsAnticipated/ActionsExecuted frame will occur as pairs and describe" + "\n" +
"an action planned and the actualised action.");
               // "Semantic Plan Representation Tool\n" + "\n" +
    
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Semantic Plan Representation");
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
                
                JButton btnNewFrame6 = new JButton("Continue");
		//add actionListener
		btnNewFrame6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				PlanTool1 frame = new PlanTool1();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame6.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame6);
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





