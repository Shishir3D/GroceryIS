/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skb.util;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author shishir
 */
public class ToggleVisibility {
    
    public void onlyEnableNoModeSelected(JTextField tfProductSupplier, JTextField tfProductQuantity, JTextField tfProductUnit, JTextField tfProductWeight, JTextField tfProductId, JTextField tfProductPrice, JTextField tfProductName, List productList, JTable productTable, JTextField tfProductSupplier1, JTextField tfProductQuantity1, JTextField tfProductUnit1, JTextField tfProductWeight1, JTextField tfProductId1, JTextField tfProductPrice1, JTextField tfProductName1, JTextField tfProductName2, JButton btnRemoveIt, JButton btnUpdateIt, JButton btnAddIt, JPanel pnlAddModeSelected, JPanel pnlUpdateModeSelected, JPanel pnlRemoveModeSelected, JPanel pnlNoModeSelected){
        // Set all components to be invisible
        tfProductSupplier.setVisible(false);
        tfProductQuantity.setVisible(false);
        tfProductUnit.setVisible(false);
        tfProductWeight.setVisible(false);
        tfProductId.setVisible(false);
        tfProductPrice.setVisible(false);
        tfProductName.setVisible(false);
        tfProductSupplier1.setVisible(false);
        tfProductQuantity1.setVisible(false);
        tfProductUnit1.setVisible(false);
        tfProductWeight1.setVisible(false);
        tfProductId1.setVisible(false);
        tfProductPrice1.setVisible(false);
        tfProductName1.setVisible(false);
        tfProductName2.setVisible(false);
        btnRemoveIt.setVisible(false);
        btnUpdateIt.setVisible(false);
        btnAddIt.setVisible(false);
        pnlAddModeSelected.setVisible(false);
        pnlUpdateModeSelected.setVisible(false);
        pnlRemoveModeSelected.setVisible(false);
        pnlNoModeSelected.setVisible(false);
    }
    
}
