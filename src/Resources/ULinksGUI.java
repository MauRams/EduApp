/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author klasecki
 */
public class ULinksGUI extends javax.swing.JPanel {
private ArrayList <Link> linkList;
private static final Object[][] rowData = {};
private static final Object[] columnNames = {"Subject","Name" , "Link", "Description"};
    /**
     * Creates new form ULinksGUI
     */
    public ULinksGUI() {
        super();
        initComponents();
        linkList = new ArrayList <Link>();
        readFile();
        
        DefaultTableModel listTableModel;
        listTableModel  = new DefaultTableModel(rowData, columnNames);
        
        Link l;
        for (int i = 0; i < linkList.size(); i++) { 
	         l = linkList.get(i);
                listTableModel.addRow(new Object[]{l.getSubject(),
	                l.getName(),
	                l.getLink(),
                        l.getDecr()});
	        }
        Table1.setModel(listTableModel);
                     
        
        Table1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int row = Table1.rowAtPoint(new Point(e.getX(), e.getY()));
            int col = Table1.columnAtPoint(new Point(e.getX(), e.getY()));


            String url = (String) Table1.getModel().getValueAt(row, col);
            if (col == 2)  {
            try {
            Desktop.getDesktop().browse(new URI(url));
            } catch (Exception ex) {
                
            }
        }
            
            
            // DO here what you want to do with your url
        }


        
    });
        
       Table1.getColumnModel().getColumn(2).setCellRenderer(new TableCellRenderer() {

        @Override
        public Component getTableCellRendererComponent(JTable table, final Object value, boolean arg2,
                boolean arg3, int arg4, int arg5) {
            final JLabel lab = new JLabel("<html><a href=\"" + value + "\">" + value + "</a>");
            return lab;
        }
    }); 
        
    }

    private void readFile() {
        
        File inFile;
        FileInputStream fiStream;
        ObjectInputStream oiStream;
        //use a try statement
        try{
            //create objects
            inFile = new File("flinks.dat");
            fiStream = new FileInputStream(inFile);
            oiStream = new ObjectInputStream(fiStream);
            //read arrayList from file
            linkList = (ArrayList <Link>)oiStream.readObject();
            //loop through the ArrayList
            
        }
        //catch IOException
        catch(IOException e){
            System.out.println(e);
        }
        //catch classNotFoundException
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        BTadd = new javax.swing.JButton();
        LBulinks = new javax.swing.JLabel();

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table1);

        BTadd.setText("Add new link");
        BTadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTaddActionPerformed(evt);
            }
        });

        LBulinks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LBulinks.setText("Useful Links");
        LBulinks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTadd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBulinks)
                                .addGap(0, 487, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBulinks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTadd)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTaddActionPerformed
     this.removeAll();
     this.repaint();
     this.revalidate();
        
        ULinksAddGUI ULinksAddGUI = new ULinksAddGUI();
              
        getParent().add(ULinksAddGUI);
        getParent().revalidate();  
        getParent().repaint();
        getParent().revalidate();  
    }//GEN-LAST:event_BTaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTadd;
    private javax.swing.JLabel LBulinks;
    private javax.swing.JTable Table1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
