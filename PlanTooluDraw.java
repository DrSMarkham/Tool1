import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import uDrawGraph-3.1.1-0-win32-en;
//import foo.*;
//import foo.bar.Baz

public class PlanTooluDraw extends JFrame {
public PlanTooluDraw() {
Runtime runtime;
Process process;
BufferedReader stdout;
String output;
JTextArea displayOutput;
StringBuffer allOutput;

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Setup the JFrame

// Use BorderLayout
getContentPane().setLayout(new BorderLayout());

// Create the TextArea which will display the EXE's output
displayOutput = new JTextArea(10, 60);

// Place the TextArea on the JFrame
getContentPane().add(new JScrollPane(displayOutput), BorderLayout.SOUTH);

// Size the JFrame
pack();

// Show the JFrame
setVisible(true);

// Now we will run the EXE and display the output

// Need a place to house the collected output
allOutput = new StringBuffer();

// Access the runtime environment so we can run the EXE
runtime = Runtime.getRuntime();

//public class MyClass {
//    Baz myBaz = null;               //declare a member of type Baz class from package foo.bar
//    foo.bar.BazBaz myBazBaz = null; //by using a fully qualified classname, I didn't need to write an import statement for foo.bar.BazBaz  
//}
// We can encounter checked exceptions, so we need a try block
try {
// Run the EXE, retain the reference to the process that is started
process = runtime.exec("uDrawGraph-3.1.1-0-win32-en.exe C:\\Program Files\\uDraw(Graph)");

// Get the standard output from the EXE
stdout = new BufferedReader(new InputStreamReader(process.
getInputStream()));

// As long as we don't get a null value, keep reading from the stream
while ((output = stdout.readLine()) != null) {
// Append the collected input into the message buffer
allOutput.append(output);
// If we gont one or more characters then we need a newline
// since we are reading a line at a time
if (output.length() > 0) {
allOutput.append('\n');
}

// Place the collected text into the TextArea
displayOutput.setText(allOutput.toString());

// Set the caret in the TextArea to the end of the current text
// so that the most recent output is visible
displayOutput.setCaretPosition(allOutput.length()) ;
}
} catch (Throwable throwable) {
// Report the error
allOutput.append(
"\nError while running command. Exception Class/Message: " +
throwable.getClass().getName() + "/" + throwable.getMessage() +
"\n" + throwable.getStackTrace().toString());
}
}

/**
* Run the program
*
* @param args String[]
*/
public static void main(String[] args) {
new PlanTooluDraw();
}
} 