package Project1;

import com.sun.xml.internal.ws.spi.db.FieldGetter;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

/**
 * Write a description  here.
 *
 * @author Ferguson
 * @version August 7, 2021
 */
public class CountDownTimerPanelSwing extends JPanel {

    private CountDownTimer watch;
    private final Timer javaTimer;

    private final JButton startButton;
    private final JButton stopButton;
    private final JButton saveButton;
    private final JButton loadButton;
    private final JButton addButton;
    private final JButton stringInputButton;
    private final JButton continueButton;
    private final JTextField hourField;
    private final JTextField minField;
    private final JTextField secondField;
    private final JTextField addSecondsField;
    private final JTextField newStringField;
    private final JLabel lblTime;
    private final JLabel hourTime;
    private final JLabel minuteTime;
    private final JLabel secondTime;
    private final JPanel blank;


    public CountDownTimerPanelSwing() {

        // create the game object as well as the GUI1024 Frame
        watch = new CountDownTimer();
        javaTimer = new Timer(1000, new TimerListener());

        setLayout(new GridLayout(9, 2));
        setBackground(Color.lightGray);

        // Code goes on...

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        addButton = new JButton(("Add"));
        stringInputButton = new JButton("New");
        continueButton = new JButton("Continue");
        hourField = new JTextField();
        minField = new JTextField();
        secondField = new JTextField();
        addSecondsField = new JTextField();
        newStringField = new JTextField();
        hourTime = new JLabel("Hours:");
        minuteTime = new JLabel("Minutes:");
        secondTime = new JLabel("Seconds:");
        blank = new JPanel();

        add(hourField);
        add(hourTime);
        add(minField);
        add(minuteTime);
        add(secondField);
        add(secondTime);
        add(stopButton);
        add(startButton);
        add(loadButton);
        add(saveButton);
        add(addButton);
        add(addSecondsField);
        add(stringInputButton);
        add(newStringField);
        add(continueButton);
        add(blank);


        lblTime = new JLabel();
        lblTime.setText(watch.toString());
        add(lblTime);

        add(new JLabel("Time:"));

        startButton.addActionListener(new ButtonListener());
        stopButton.addActionListener(new ButtonListener());
        saveButton.addActionListener(new ButtonListener());
        loadButton.addActionListener(new ButtonListener());
        addButton.addActionListener(new ButtonListener());
        stringInputButton.addActionListener(new ButtonListener());
        continueButton.addActionListener(new ButtonListener());



    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            int mins, sec, milli;

            if (event.getSource() == stopButton) {
                javaTimer.stop();
            }

            if (event.getSource() == startButton) {
                try {
                    mins = Integer.parseInt(hourField.getText());
                    sec = Integer.parseInt(minField.getText());
                    milli = Integer.parseInt(secondField.getText());
                    watch = new CountDownTimer(mins, sec, milli);
                } catch (NumberFormatException io) {
                    JOptionPane.showMessageDialog(null, "Enter an integer in all fields");
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Error in field");
                }
                javaTimer.start();
            }

            if(event.getSource() == continueButton){
                javaTimer.start();
            }

            if(event.getSource() == addButton){
                watch.add(Integer.parseInt(addSecondsField.getText()));
                hourField.setText(String.valueOf(watch.getHours()));
                minField.setText(String.valueOf(watch.getMinutes()));
                secondField.setText(String.valueOf(watch.getSeconds()));

            }

            if(event.getSource() == stringInputButton) {
                watch = new CountDownTimer(newStringField.getText());

                mins = watch.getHours();
                sec = watch.getMinutes();
                milli = watch.getSeconds();

                String stringMins = Integer.toString(mins);
                String stringSec = Integer.toString((sec));
                String stringMilli = Integer.toString(milli);

                hourField.setText(stringMins);
                minField.setText(stringSec);
                secondField.setText(stringMilli);
            }

            if (event.getSource() == saveButton) {
                try {
                    mins = Integer.parseInt(hourField.getText());
                    sec = Integer.parseInt(minField.getText());
                    milli = Integer.parseInt(secondField.getText());
                    watch = new CountDownTimer(mins, sec, milli);
                } catch (NumberFormatException io) {
                    JOptionPane.showMessageDialog(null, "Enter an integer in all fields");
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Error in field");
                }
                JFileChooser save = new JFileChooser();
                int userAction = save.showSaveDialog(null);
                if (userAction == JFileChooser.APPROVE_OPTION) {
                    File getFile = save.getSelectedFile();
                    watch.save(getFile.toString());
                }
            }
            if (event.getSource() == loadButton) {
                JFileChooser load = new JFileChooser();
                int userAction = load.showOpenDialog(null);
                if (userAction == JFileChooser.APPROVE_OPTION) {
                    File getFile = load.getSelectedFile();
                    watch.load(getFile.toString());
                    mins = watch.getHours();
                    sec = watch.getMinutes();
                    milli = watch.getSeconds();
                    String stringMins = Integer.toString(mins);
                    String stringSec = Integer.toString((sec));
                    String stringMilli = Integer.toString(milli);

                    hourField.setText(stringMins);
                    minField.setText(stringSec);
                    secondField.setText(stringMilli);
                }
                lblTime.setText(watch.toString());
            }
        }
    }

    private class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                watch.sub(1);
                if(watch.getSeconds() == -1){
                    watch.setSeconds(59);
                }
                if(watch.getHours() == 0 && watch.getMinutes() == 0 && watch.getSeconds() == -1){
                    JOptionPane.showMessageDialog(null, "Happy New Year");
                }
                lblTime.setText(watch.toString());
            }
            catch (Exception exception) {
                throw new IllegalArgumentException();
            }
        }
    }
}
