package com.skb.util;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Utility class for managing the visibility of UI components in a panel.
 * Provides functionality to hide all components when no mode is selected.
 * 
 * This is designed for a scenario where different modes (e.g., Add, Update, Remove) 
 * require specific UI components to be shown or hidden.
 * 
 * @author 23048645 Shishir Poudel
 */
public class ToggleVisibility {
    
    /**
     * Hides all UI components when no mode is selected.
     * 
     * @param tfProductSupplier        TextField for product supplier input.
     * @param tfProductQuantity        TextField for product quantity input.
     * @param tfProductUnit            TextField for product unit input.
     * @param tfProductWeight          TextField for product weight input.
     * @param tfProductId              TextField for product ID input.
     * @param tfProductPrice           TextField for product price input.
     * @param tfProductName            TextField for product name input.
     * @param productList              List of products.
     * @param productTable             JTable for displaying product data.
     * @param tfProductSupplier1       Another TextField for product supplier input.
     * @param tfProductQuantity1       Another TextField for product quantity input.
     * @param tfProductUnit1           Another TextField for product unit input.
     * @param tfProductWeight1         Another TextField for product weight input.
     * @param tfProductId1             Another TextField for product ID input.
     * @param tfProductPrice1          Another TextField for product price input.
     * @param tfProductName1           Another TextField for product name input.
     * @param tfProductName2           Additional TextField for product name input.
     * @param btnRemoveIt              Button for the remove action.
     * @param btnUpdateIt              Button for the update action.
     * @param btnAddIt                 Button for the add action.
     * @param pnlAddModeSelected       Panel for Add mode.
     * @param pnlUpdateModeSelected    Panel for Update mode.
     * @param pnlRemoveModeSelected    Panel for Remove mode.
     * @param pnlNoModeSelected        Panel for No mode selected.
     */
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
