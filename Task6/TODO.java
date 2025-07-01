import javax.swing.*;

public class TODO {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My To-Do List");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField taskField = new JTextField();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        deleteButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                listModel.remove(selected);
            }
        });

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(taskField);
        topPanel.add(addButton);
        topPanel.add(deleteButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(topPanel);
        frame.add(new JScrollPane(taskList));

        frame.setVisible(true);
    }
}
