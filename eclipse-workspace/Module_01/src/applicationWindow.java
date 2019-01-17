import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

//Author Name: George Harrington
//Date: 1/13/2019
//Program Name: Call Flight Attendant
//Purpose: Simulation using "call" button, call attendant
public class applicationWindow {

	private JFrame frmCallFlightAttendant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationWindow window = new applicationWindow();
					window.frmCallFlightAttendant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public applicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon off = new ImageIcon(getClass().getResource("/images/off-24px.png"));
		ImageIcon on = new ImageIcon(getClass().getResource("/images/on-24px.png"));
		
		frmCallFlightAttendant = new JFrame();
		frmCallFlightAttendant.setResizable(false);
		frmCallFlightAttendant.setTitle("Call Flight Attendant");
		frmCallFlightAttendant.setBounds(100, 100, 300, 200);
		frmCallFlightAttendant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblActiveCall = new JLabel("No Active Call");
		lblActiveCall.setHorizontalAlignment(SwingConstants.CENTER);
		frmCallFlightAttendant.getContentPane().add(lblActiveCall, BorderLayout.NORTH);
		
		
		
		Box horizontalBox = Box.createHorizontalBox();
		frmCallFlightAttendant.getContentPane().add(horizontalBox, BorderLayout.CENTER);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(verticalBox_1);
		verticalBox_1.setBorder(null);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		JButton btnSeat_01 = new JButton("Seat 1");
		horizontalBox_1.add(btnSeat_01);
		
		JLabel lblNewLabel_01 = new JLabel("");
		lblNewLabel_01.setIcon(off);
		horizontalBox_1.add(lblNewLabel_01);
		btnSeat_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 1");
				lblNewLabel_01.setIcon(on);
			}
		});
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		JButton btnSeat_02 = new JButton("Seat 2");
		horizontalBox_2.add(btnSeat_02);
		
		JLabel lblNewLabel_02 = new JLabel("");
		lblNewLabel_02.setIcon(off);
		horizontalBox_2.add(lblNewLabel_02);
		btnSeat_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 2");
				lblNewLabel_02.setIcon(on);
			}
		});
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3);
		
		JButton btnSeat_03 = new JButton("Seat 3");
		horizontalBox_3.add(btnSeat_03);
		
		JLabel lblNewLabel_03 = new JLabel("");
		lblNewLabel_03.setIcon(off);
		horizontalBox_3.add(lblNewLabel_03);
		btnSeat_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 3");
				lblNewLabel_03.setIcon(on);
			}
		});
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(verticalBox);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		JButton btnSeat_04 = new JButton("Seat 4");
		horizontalBox_4.add(btnSeat_04);
		
		JLabel lblNewLabel_04 = new JLabel("");
		lblNewLabel_04.setIcon(off);
		horizontalBox_4.add(lblNewLabel_04);
		btnSeat_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 4");
				lblNewLabel_04.setIcon(on);
			}
		});
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5);
		
		JButton btnSeat_05 = new JButton("Seat 5");
		horizontalBox_5.add(btnSeat_05);
		
		JLabel lblNewLabel_05 = new JLabel("");
		lblNewLabel_05.setIcon(off);
		horizontalBox_5.add(lblNewLabel_05);
		btnSeat_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 5");
				lblNewLabel_05.setIcon(on);
			}
		});
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_6);
		
		JButton btnSeat_06 = new JButton("Seat 6");
		horizontalBox_6.add(btnSeat_06);
		
		JLabel lblNewLabel_06 = new JLabel("");
		lblNewLabel_06.setIcon(off);
		horizontalBox_6.add(lblNewLabel_06);
		btnSeat_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("Seat 6");
				lblNewLabel_06.setIcon(on);
			}
		});
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_2);
		
		JButton btnCancel = new JButton("Cancel");
		frmCallFlightAttendant.getContentPane().add(btnCancel, BorderLayout.SOUTH);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActiveCall.setText("No Active Call");
				lblNewLabel_01.setIcon(off);
				lblNewLabel_02.setIcon(off);
				lblNewLabel_03.setIcon(off);
				lblNewLabel_04.setIcon(off);
				lblNewLabel_05.setIcon(off);
				lblNewLabel_06.setIcon(off);
			}
		});
	}

}