package prac15.num_2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CountryInfoMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel label = new JLabel("Выберите страну:");
        label.setBounds(20, 20, 120, 20);
        frame.add(label);

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        countryBox.setBounds(150, 20, 120, 20);
        frame.add(countryBox);

        JTextArea infoArea = new JTextArea();
        infoArea.setBounds(20, 50, 250, 40);
        infoArea.setEditable(false);
        frame.add(infoArea);

        Map<String, String> countryInfo = new HashMap<>();
        countryInfo.put("Australia", "Столица: Канберра\nКонтинент: Австралия");
        countryInfo.put("China", "Столица: Пекин\nКонтинент: Азия");
        countryInfo.put("England", "Столица: Лондон\nКонтинент: Европа");
        countryInfo.put("Russia", "Столица: Москва\nКонтинент: Евразия");

        countryBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryBox.getSelectedItem();
                infoArea.setText(countryInfo.get(selectedCountry));
            }
        });
        frame.setLocationRelativeTo(null); // Центрирование окна
        frame.setVisible(true);
    }
}

