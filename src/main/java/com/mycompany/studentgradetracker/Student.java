
package com.mycompany.studentgradetracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student extends JFrame implements ActionListener{
   JTextField nameField, gradeField;
    JTextArea displayArea;
    JButton addBtn, clearBtn, summaryBtn;
    
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Double> grades = new ArrayList<>();

    public Student() {
        setTitle("Student Grade Tracker");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Grade (0-100):"));
        gradeField = new JTextField();
        inputPanel.add(gradeField);

        addBtn = new JButton("Add Student");
        summaryBtn = new JButton("Generate Summary");
        inputPanel.add(addBtn);
        inputPanel.add(summaryBtn);

        add(inputPanel, BorderLayout.NORTH);

        // Display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Clear button
        clearBtn = new JButton("Clear All");
        add(clearBtn, BorderLayout.SOUTH);

        // Listeners
        addBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        summaryBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String name = nameField.getText().trim();
            String gradeText = gradeField.getText().trim();

            if (name.isEmpty() || gradeText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both name and grade.");
                return;
            }

            try {
                double grade = Double.parseDouble(gradeText);
                if (grade < 0 || grade > 100) {
                    JOptionPane.showMessageDialog(this, "Grade must be between 0 and 100.");
                    return;
                }
                if(name.matches(".*[0-9].*")){
                    JOptionPane.showMessageDialog(this, "Name cannot contain numbers!");
                    return;
                }
                names.add(name);
                grades.add(grade);

                String letter = convertToLetterGrade(grade);
                displayArea.append("Added: " + name + ", Grade: " + grade + ", Letter: " + letter + "\n");

                nameField.setText("");
                gradeField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid grade format.");
            }
        } else if (e.getSource() == clearBtn) {
            names.clear();
            grades.clear();
            displayArea.setText("");
        } else if (e.getSource() == summaryBtn) {
            displaySummary();
        }
    }

    private void displaySummary() {
        if (grades.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No students added yet.");
            return;
        }

        double high = Double.MIN_VALUE;
        double low = Double.MAX_VALUE;
        double sum = 0;
        String topStudent = "", lowStudent = "";

        for (int i = 0; i < grades.size(); i++) {
            double g = grades.get(i);
            sum += g;

            if (g > high) {
                high = g;
                topStudent = names.get(i);
            }

            if (g < low) {
                low = g;
                lowStudent = names.get(i);
            }
        }

        double avg = sum / grades.size();

        displayArea.append("\n---- Summary ----\n");
        displayArea.append("Highest Grade: " + topStudent + " (" + high + ") - " + convertToLetterGrade(high) + "\n");
        displayArea.append("Lowest Grade: " + lowStudent + " (" + low + ") - " + convertToLetterGrade(low) + "\n");
        displayArea.append(String.format("Average Grade: %.2f\n", avg));
    }

    private String convertToLetterGrade(double grade) {
        if (grade >= 90) return "A";
        else if (grade >= 85) return "A-";
        else if (grade >= 80) return "B+";
        else if (grade >= 75) return "B";
        else if (grade >= 70) return "B-";
        else if (grade >= 65) return "C+";
        else if (grade >= 60) return "C";
        else if (grade >= 55) return "C-";
        else if (grade >= 50) return "D";
        else return "F";
    }

}
