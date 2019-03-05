//Andrew Karpman
//MultiThreading lab
//runs a counting thread that is faster once the lab is complete
package lab;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.*;

public class UnresponsiveUIThread extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
// Start or stop counter flag
	private boolean stop = false;
	private JTextField tfCount;
	private int count = 1;

	public UnresponsiveUIThread() {
		//Thread.setPriority(3);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		cp.add(new JLabel("Counter"));
		tfCount = new JTextField(count + " ", 10);
		tfCount.setEditable(false);
		cp.add(tfCount);
		JButton btnStart = new JButton("Start Counting");
		cp.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				stop = false;
				run();
			}
		});
		JButton btnStop = new JButton("Stop Counting");
		cp.add(btnStop);
		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
// Signal that we need to stop
				stop = true;
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Counter");
		setSize(300, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newFixedThreadPool(3);
		//executor.execute(new UnresponsiveUIThread());//runs code then stops
		//executor.shutdown();//this might be causing the 
// Run GUI codes in Event-Dispatching thread for thread safety
		UnresponsiveUIThread thread = new UnresponsiveUIThread();
		thread.run();
		//run();
	}
	@Override
	public void run() {
		while(!stop) {//modified so it will only stop when the user clicks stop
			//only issue is the code wont close
			// Check if STOP button has been pushed
			// which changes the stop flag state to true
			if (stop)
				break;
			tfCount.setText(count + " ");
			++count;
		}

	}
}
