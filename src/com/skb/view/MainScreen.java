package com.skb.view;
import com.skb.model.ProductModel;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shishir
 */
public class MainScreen extends javax.swing.JFrame {
    
    private List<ProductModel> productList;

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        initializeData();
        
        //My Code
        setTitle("Shishir Khadya Bhandar");    
        setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        pnlHomeTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlProductTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlControlTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlSearchBar = new javax.swing.JPanel();
        lblBackArrow = new javax.swing.JLabel();
        lblFrontArrow = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();
        textFieldSearchBar = new javax.swing.JTextField();
        pnlAllScreens = new javax.swing.JPanel();
        pnlProductScreen = new javax.swing.JPanel();
        lblProductScreenProductsTable = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        pnlHomeScreen = new javax.swing.JPanel();
        lblHomeBackground = new javax.swing.JLabel();
        pnlControlScreen = new javax.swing.JPanel();
        lblControlScreenMode = new javax.swing.JLabel();
        comboBoxModeSelector = new javax.swing.JComboBox<>();
        pnlAllControlPanels = new javax.swing.JPanel();
        pnlNoModeSelected = new javax.swing.JPanel();
        pnlRemoveModeSelected = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlUpdateModeSelected = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlAddModeSelected = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mainScreenFrame");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(40, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTopBar.setBackground(new java.awt.Color(255, 255, 255));
        pnlTopBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTopBar.setMaximumSize(new java.awt.Dimension(1280, 59));
        pnlTopBar.setMinimumSize(new java.awt.Dimension(1280, 59));
        pnlTopBar.setPreferredSize(new java.awt.Dimension(1280, 59));
        pnlTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHomeTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHomeTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeTabMouseClicked(evt);
            }
        });

        jLabel1.setText("Home");

        javax.swing.GroupLayout pnlHomeTabLayout = new javax.swing.GroupLayout(pnlHomeTab);
        pnlHomeTab.setLayout(pnlHomeTabLayout);
        pnlHomeTabLayout.setHorizontalGroup(
            pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlHomeTabLayout.setVerticalGroup(
            pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pnlTopBar.add(pnlHomeTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        pnlProductTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlProductTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProductTabMouseClicked(evt);
            }
        });

        jLabel2.setText("Product");

        javax.swing.GroupLayout pnlProductTabLayout = new javax.swing.GroupLayout(pnlProductTab);
        pnlProductTab.setLayout(pnlProductTabLayout);
        pnlProductTabLayout.setHorizontalGroup(
            pnlProductTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlProductTabLayout.setVerticalGroup(
            pnlProductTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pnlTopBar.add(pnlProductTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, -1));

        pnlControlTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlControlTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlControlTabMouseClicked(evt);
            }
        });

        jLabel3.setText("Control");

        javax.swing.GroupLayout pnlControlTabLayout = new javax.swing.GroupLayout(pnlControlTab);
        pnlControlTab.setLayout(pnlControlTabLayout);
        pnlControlTabLayout.setHorizontalGroup(
            pnlControlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlTabLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        pnlControlTabLayout.setVerticalGroup(
            pnlControlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTopBar.add(pnlControlTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 160, -1));

        getContentPane().add(pnlTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        pnlSearchBar.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBackArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/skb/resoruces/backArrow.png"))); // NOI18N

        lblFrontArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/skb/resoruces/frontArrow.png"))); // NOI18N

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/skb/resoruces/refresh.png"))); // NOI18N

        javax.swing.GroupLayout pnlSearchBarLayout = new javax.swing.GroupLayout(pnlSearchBar);
        pnlSearchBar.setLayout(pnlSearchBarLayout);
        pnlSearchBarLayout.setHorizontalGroup(
            pnlSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblBackArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFrontArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlSearchBarLayout.setVerticalGroup(
            pnlSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBackArrow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrontArrow, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(pnlSearchBarLayout.createSequentialGroup()
                        .addComponent(textFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(pnlSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 40));

        pnlAllScreens.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProductScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductScreenProductsTable.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        lblProductScreenProductsTable.setText("Products Table");
        pnlProductScreen.add(lblProductScreenProductsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 49, -1, -1));

        tableScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableScrollPane.setEnabled(false);
        tableScrollPane.setFocusable(false);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Supplier", "Weight", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
            productTable.getColumnModel().getColumn(5).setResizable(false);
            productTable.getColumnModel().getColumn(6).setResizable(false);
        }

        pnlProductScreen.add(tableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 1280, 488));

        pnlAllScreens.add(pnlProductScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblHomeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/skb/resoruces/HomeBackground.png"))); // NOI18N

        javax.swing.GroupLayout pnlHomeScreenLayout = new javax.swing.GroupLayout(pnlHomeScreen);
        pnlHomeScreen.setLayout(pnlHomeScreenLayout);
        pnlHomeScreenLayout.setHorizontalGroup(
            pnlHomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeScreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHomeBackground)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHomeScreenLayout.setVerticalGroup(
            pnlHomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeScreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHomeBackground)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlAllScreens.add(pnlHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        lblControlScreenMode.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblControlScreenMode.setText("Mode:");

        comboBoxModeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Mode", "ADD", "UPDATE", "REMOVE" }));
        comboBoxModeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxModeSelectorActionPerformed(evt);
            }
        });

        pnlAllControlPanels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAllControlPanels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlNoModeSelectedLayout = new javax.swing.GroupLayout(pnlNoModeSelected);
        pnlNoModeSelected.setLayout(pnlNoModeSelectedLayout);
        pnlNoModeSelectedLayout.setHorizontalGroup(
            pnlNoModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        pnlNoModeSelectedLayout.setVerticalGroup(
            pnlNoModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        pnlAllControlPanels.add(pnlNoModeSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 490));

        jLabel4.setText("remove mode");

        javax.swing.GroupLayout pnlRemoveModeSelectedLayout = new javax.swing.GroupLayout(pnlRemoveModeSelected);
        pnlRemoveModeSelected.setLayout(pnlRemoveModeSelectedLayout);
        pnlRemoveModeSelectedLayout.setHorizontalGroup(
            pnlRemoveModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRemoveModeSelectedLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel4)
                .addContainerGap(798, Short.MAX_VALUE))
        );
        pnlRemoveModeSelectedLayout.setVerticalGroup(
            pnlRemoveModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRemoveModeSelectedLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(165, 165, 165))
        );

        pnlAllControlPanels.add(pnlRemoveModeSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 490));

        jLabel5.setText("update Mode");

        javax.swing.GroupLayout pnlUpdateModeSelectedLayout = new javax.swing.GroupLayout(pnlUpdateModeSelected);
        pnlUpdateModeSelected.setLayout(pnlUpdateModeSelectedLayout);
        pnlUpdateModeSelectedLayout.setHorizontalGroup(
            pnlUpdateModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(pnlUpdateModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUpdateModeSelectedLayout.createSequentialGroup()
                    .addGap(552, 552, 552)
                    .addComponent(jLabel5)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );
        pnlUpdateModeSelectedLayout.setVerticalGroup(
            pnlUpdateModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(pnlUpdateModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUpdateModeSelectedLayout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(jLabel5)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );

        pnlAllControlPanels.add(pnlUpdateModeSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 490));

        javax.swing.GroupLayout pnlAddModeSelectedLayout = new javax.swing.GroupLayout(pnlAddModeSelected);
        pnlAddModeSelected.setLayout(pnlAddModeSelectedLayout);
        pnlAddModeSelectedLayout.setHorizontalGroup(
            pnlAddModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        pnlAddModeSelectedLayout.setVerticalGroup(
            pnlAddModeSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        pnlAllControlPanels.add(pnlAddModeSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 490));

        javax.swing.GroupLayout pnlControlScreenLayout = new javax.swing.GroupLayout(pnlControlScreen);
        pnlControlScreen.setLayout(pnlControlScreenLayout);
        pnlControlScreenLayout.setHorizontalGroup(
            pnlControlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblControlScreenMode)
                .addGap(18, 18, 18)
                .addComponent(comboBoxModeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(pnlControlScreenLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pnlAllControlPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlControlScreenLayout.setVerticalGroup(
            pnlControlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlScreenLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlControlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblControlScreenMode)
                    .addComponent(comboBoxModeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(pnlAllControlPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlAllScreens.add(pnlControlScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        getContentPane().add(pnlAllScreens, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1280, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHomeTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeTabMouseClicked
        // TODO add your handling code here:
        pnlHomeScreen.setVisible(true);
        pnlProductScreen.setVisible(false);
        pnlControlScreen.setVisible(false);
    }//GEN-LAST:event_pnlHomeTabMouseClicked
 
    private void pnlProductTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProductTabMouseClicked
        // TODO add your handling code here:
        pnlHomeScreen.setVisible(false);
        pnlProductScreen.setVisible(true);
        pnlControlScreen.setVisible(false);
    }//GEN-LAST:event_pnlProductTabMouseClicked

    private void comboBoxModeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxModeSelectorActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) comboBoxModeSelector.getSelectedItem();
                
        // hide all panels
        pnlNoModeSelected.setVisible(false);
        pnlRemoveModeSelected.setVisible(false);
        pnlAddModeSelected.setVisible(false);
        pnlUpdateModeSelected.setVisible(false);

        // Show the selected panel
        switch (selectedOption) {
            case "No Mode":
                pnlNoModeSelected.setVisible(true);
                break;
            case "REMOVE":
                pnlRemoveModeSelected.setVisible(true);
                break;
            case "ADD":
                pnlAddModeSelected.setVisible(true);
                break;
            case "UPDATE":
                pnlUpdateModeSelected.setVisible(true);
                break;
        }
        pack();
    }//GEN-LAST:event_comboBoxModeSelectorActionPerformed

    private void pnlControlTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlControlTabMouseClicked
        // TODO add your handling code here:
        pnlHomeScreen.setVisible(false);
        pnlProductScreen.setVisible(false);
        pnlControlScreen.setVisible(true);
    }//GEN-LAST:event_pnlControlTabMouseClicked

    // Method to add product data and populate the table
    private void registerProduct(ProductModel item) {
        productList.add(item);
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.addRow(new Object[]{
            item.getProductId(),item.getProductName(), item.getPrice(), item.getQuantity(), item.getSupplier(), item.getWeight(), item.getWeightUnit()
        });
    }
    
    // Method to initialize data, including student list and table
    private void initializeData() {
        productList = new LinkedList();
        registerProduct(new ProductModel(1,"Rice", "20", "kg", "Newari", 2500, 10));
        registerProduct(new ProductModel(2, "Wheat Flour", "5", "kg", "Organic Farms", 200, 5));
        registerProduct(new ProductModel(3, "Sugar", "1", "kg", "Sweet Delight", 80, 20));
        registerProduct(new ProductModel(4, "Milk", "1", "Litre", "Dairy Fresh", 50, 15));
        registerProduct(new ProductModel(5, "Eggs", "1", "Dozen", "Happy Hens", 80, 30));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxModeSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBackArrow;
    private javax.swing.JLabel lblControlScreenMode;
    private javax.swing.JLabel lblFrontArrow;
    private javax.swing.JLabel lblHomeBackground;
    private javax.swing.JLabel lblProductScreenProductsTable;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JPanel pnlAddModeSelected;
    private javax.swing.JPanel pnlAllControlPanels;
    private javax.swing.JPanel pnlAllScreens;
    private javax.swing.JPanel pnlControlScreen;
    private javax.swing.JPanel pnlControlTab;
    private javax.swing.JPanel pnlHomeScreen;
    private javax.swing.JPanel pnlHomeTab;
    private javax.swing.JPanel pnlNoModeSelected;
    private javax.swing.JPanel pnlProductScreen;
    private javax.swing.JPanel pnlProductTab;
    private javax.swing.JPanel pnlRemoveModeSelected;
    private javax.swing.JPanel pnlSearchBar;
    private javax.swing.JPanel pnlTopBar;
    private javax.swing.JPanel pnlUpdateModeSelected;
    private javax.swing.JTable productTable;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField textFieldSearchBar;
    // End of variables declaration//GEN-END:variables
}
