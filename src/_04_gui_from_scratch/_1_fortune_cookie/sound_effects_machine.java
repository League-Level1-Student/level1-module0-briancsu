package _04_gui_from_scratch._1_fortune_cookie;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sound_effects_machine implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	public static void main(String[] args) {
		sound_effects_machine machine = new sound_effects_machine();
		machine.run();	
		}
	
	private void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path + soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}).start();
		} else {
			System.out.println("File does not exist");
		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==button1) {
			
		}
		else if(arg0.getSource()==button2) {
			
		}
		else if(arg0.getSource()==button3) {
			
		}
	}
}
