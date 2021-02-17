package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

import M.CustomerDB;
import M.CustomerManager;
import M.ProductManager;
import M.productDB;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ProductFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_name;
	private JTextField textField_ppu;
	private JTextField textField_pd;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnBrowseImg;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					ProductFrame frame = new ProductFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductFrame()
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 757, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(613, 228, 117, 29);
		contentPane.add(btnDelete);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setBounds(496, 228, 117, 29);
		contentPane.add(btnEdit);
		
		JButton btnSave = new JButton("SAVE NEW");
		btnSave.setBounds(373, 228, 117, 29);
		contentPane.add(btnSave);
		
		textField_id = new JTextField();
		textField_id.setForeground(Color.BLACK);
		textField_id.setEditable(false);
		textField_id.setColumns(10);
		textField_id.setBackground(Color.ORANGE);
		textField_id.setBounds(524, 36, 130, 26);
		contentPane.add(textField_id);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(524, 87, 130, 26);
		contentPane.add(textField_name);
		
		textField_ppu = new JTextField();
		textField_ppu.setColumns(10);
		textField_ppu.setBounds(524, 138, 130, 26);
		contentPane.add(textField_ppu);
		
		textField_pd = new JTextField();
		textField_pd.setColumns(10);
		textField_pd.setBounds(524, 176, 130, 26);
		contentPane.add(textField_pd);
		
		JLabel lblProductId = new JLabel("product id");
		lblProductId.setBounds(406, 41, 106, 16);
		contentPane.add(lblProductId);
		
		lblNewLabel = new JLabel("product name");
		lblNewLabel.setBounds(410, 92, 102, 16);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("price per unit");
		lblNewLabel_1.setBounds(406, 143, 94, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("product dest.");
		lblNewLabel_2.setBounds(406, 181, 106, 16);
		contentPane.add(lblNewLabel_2);
		
		table = new JTable();
		table.setBounds(6, 6, 349, 576);
		contentPane.add(table);
		
		ImagePanel imagePanel = new ImagePanel((Image) null);
		imagePanel.setBounds(406, 293, 261, 213);
		contentPane.add(imagePanel);
		
		btnBrowseImg = new JButton("Browse img");
		btnBrowseImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.addChoosableFileFilter(new OpenFileFilter("jpeg","photo in jpeg format"));
				fc.addChoosableFileFilter(new OpenFileFilter("jpg","photo in jpg format"));
				fc.addChoosableFileFilter(new OpenFileFilter("png","PNG imaget"));
				fc.addChoosableFileFilter(new OpenFileFilter("svg","photo in svg format"));
				fc.setAcceptAllFileFilterUsed(false);

				int returnVal  = fc.showOpenDialog(ProductFrame.this);
				
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					File f = fc.getSelectedFile();
					//open image
					try
					{
						BufferedImage bimg = ImageIO.read(f);
						imagePanel.setImage(bimg);
						
					} catch (IOException e1)
					{
						e1.printStackTrace();
					}
				}

			}
		});
		btnBrowseImg.setBounds(586, 526, 117, 29);
		contentPane.add(btnBrowseImg);
	}
}

 class OpenFileFilter extends FileFilter {

    String description = "";
    String fileExt = "";

    public OpenFileFilter(String extension) {
        fileExt = extension;
    }

    public OpenFileFilter(String extension, String typeDescription) {
        fileExt = extension;
        this.description = typeDescription;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory())
            return true;
        return (f.getName().toLowerCase().endsWith(fileExt));
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    ArrayList<productDB> list;
    public void load()
    {
    	list = ProductManager.getAllProduct();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("product_id");
		model.addColumn("product_name");
		model.addColumn("price_per_unit");
		model.addColumn("product_description");


		for (productDB c : list)
		{
			model.addRow(new Object[]
			{ c.product_id, c.product_name, c.price_per_unit, c.product_description });
		}

		table.setModel(model);
    }
}
