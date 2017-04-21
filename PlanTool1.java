
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
public class PlanTool1 extends JFrame 
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
	public PlanTool1() //constructor
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
    JFrame f = new JFrame("Semantic Plan Representation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation Tool\n" + "\n" +
    
" A schematic representation of the military campaign ontology:\n" +
"\n" +
"                                                        Military Campaign frame\n" +
"                                                                    |\n" +
"                                                           Operation sub-frame\n" +
"                                                          /                  \\           \n" +
"                                   ActionsAnticipated sub-frame      ActionsExecuted sub-frame\n" +
"                                                     \n" +
" Individual operation frames corresponding to a given military campaign are\n" +
"hierarchically ordered according to a temporal execution sequence to create a\n" +
"military campaign ontology. Individual operation frames (ontological nodes)\n" +
"could be further related by the following binary relations:\n" +
                        "\n" +
"i)Semantic similarity of objectives/operation type (reconnaissance, rescue, aid, etc.)\n" +
"ii)Overlapping (geographical) areas of operation\n" +
"iii)Semantic similarity of operation type\n" +
"iv)Semantic similarity of operational environment" +
"v)Semantic similarity of commander’s intent" +
" \n" + "\n" + 
" Frames which comprise the instances of Script Learning appear as sub-frames\n" +
"to the corresponding ActionsExecuted frames of the military campaign ontology.\n"  +
" In terms of C2IEDM the attributes of the Script Frames are:\n" +
"i)Pre-conditions for the instance(s) of experiential learning – ACTION-CONDITION\n" +
"ii)Entities –ACTION-RESOURCE\n" +
"iii)Actors – ACTION-ACTOR\n" +
"iv)Actions – ACTION-TASK\n" +
"v)Scenes – key temporal aspects (intervals) - ACTION-EVENT\n" +
"vi)Outcomes - of the experiential learning – ACTION-EFFECT\n" +
"\n" +
" Sets of instances of these script components can be used to reframe the data\n" +
"captured in the tasking expression associated with an ActionExecuted frame \n" +
"instance. This allows a task to be described in terms of sub-tasks and thereby\n" +
"capture finer detail. Individual instances of learning script frames are \n" +
"related by semantic similarity (as described above for operation frames).");
    

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
				NewWindow1 frame = new NewWindow1();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame6.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(ta);
    //add Button into contentPane
		ta.add(btnNewFrame6);
                frame.pack();
                frame.setVisible(true);
		((AbstractDocument)ta.getDocument()).dump(System.out);
    
    
                
                
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





