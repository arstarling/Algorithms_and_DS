import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedWindow extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 0;
    private ImageIcon[] frames;

    public AnimatedWindow() {
        setTitle("Пример анимации");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2000, 1000);

        // Загрузка кадров анимации
        frames = new ImageIcon[4]; // Теперь у нас 4 кадра
        for (int i = 0; i < 4; i++) {
            frames[i] = new ImageIcon("C:\\Users\\avlyiss\\resources\\" + i + ".png"); // Абсолютный путь
        }

        animationLabel = new JLabel(frames[0]);
        add(animationLabel);

        // Создание таймера для смены кадров
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimatedWindow window = new AnimatedWindow();
                window.setVisible(true);
            }
        });
    }
}
