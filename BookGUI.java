import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.ArrayList;

public class BookGUI implements ActionListener {

    private JButton a;
    private JButton b;
    private ArrayList<Book> wantList;

    public BookGUI() {



        JFrame frame = new JFrame("My First GUI");
        //
        // frame.setLayout(new BoxLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(createWantPanel());
        frame.getContentPane().add(openAddBook());
        frame.setVisible(true);
    }

    public JPanel createWantPanel() {
        JPanel wantPanel = new JPanel();

        Book book1 = new Book("Oathbringer", "Brandon Sanderson", 1211);
        wantList = new ArrayList<Book>();
        wantList.add(book1);

        JTextField booksField = new JTextField();

        b = new JButton("Open Server Frame");
        b.addActionListener(this);
        wantPanel.add(b);



        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    booksField.setText(wantList.toString());
                    System.out.println(wantList);
                }
            }
        }.start();

        wantPanel.add(booksField);
        return wantPanel;
    }

    public JPanel openAddBook() {
        //JFrame addBook = new JFrame("Add Book");
        JPanel addBook = new JPanel();
        a = new JButton("Add Book");
        a.addActionListener(this);
        addBook.add(a);
//        addBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        addBook.setSize(300,300);
//        //JButton button1 = new JButton("Press");
//        addBook.getContentPane().add(a);
//        addBook.setVisible(true);
        return addBook;
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            wantList.add(new Book("A", "B", 124));
        } else if (e.getSource() == b) {
            openAddBook();
        }

    }
    class ArrayListFocusListener implements FocusListener {
        JTextField textField;
        ArrayList<String> backingList;
        int myIndex;

        public ArrayListFocusListener(JTextField textField, ArrayList<String> backingList, int myIndex) {
            this.textField = textField;
            this.backingList = backingList;
            this.myIndex = myIndex;
        }

        public void focusGained(FocusEvent e) {
        }


        public void focusLost(FocusEvent e) {
            backingList.set(myIndex, textField.getText());
        }

    }
    public static void main(String args[]){
        new BookGUI();
    }
};


