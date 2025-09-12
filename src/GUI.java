import javax.swing.*;

public class GUI{

    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColour;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

    public static void main(String[] args){
        new GUI();
    }

    public GUI(){
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }

    public void createWindow(){
        window = new JFrame("Notepad");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea(){
        textArea = new JTextArea();

        // The editor will have a scroll pane, both vertically or horizontally when needed
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }

    public void createMenuBar(){
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        menuColour = new JMenu("Colour");
        menuBar.add(menuColour);
    }

    public void createFileMenu(){
        iNew = new JMenuItem("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }
}