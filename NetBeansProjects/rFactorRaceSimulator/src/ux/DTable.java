/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Sergio
 */
public class DTable extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex) {
        Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);

        component.setBackground(new Color(248,249,250));
        component.setForeground(Color.BLACK);
        component.setFocusable(false);
        
        //Header set
        setValueAt("Pos.", 0, 0);
        setValueAt("No.", 0, 1);
        setValueAt("Driver", 0, 2);
        setValueAt("Team", 0, 3);
        setValueAt("Time/Retired", 0, 4);
        setValueAt("Points", 0, 5);
        
        //Points set
        setValueAt(25, 1, 5);
        setValueAt(20, 2, 5);
        setValueAt(16, 3, 5);
        setValueAt(13, 4, 5);
        setValueAt(11, 5, 5);
        setValueAt(10, 6, 5);
        setValueAt(9, 7, 5);
        setValueAt(8, 8, 5);
        setValueAt(7, 9, 5);
        setValueAt(6, 10, 5);
        setValueAt(5, 11, 5);
        setValueAt(4, 12, 5);
        setValueAt(3, 13, 5);
        setValueAt(2, 14, 5);
        setValueAt(1, 15, 5);
        
        if(columnIndex == 0 ||rowIndex == 0) { //POSICIÓN
            component.setBackground(new Color(234,236,240));
            component.setFont(component.getFont().deriveFont(Font.BOLD));
        }
        else if((columnIndex == 2 || columnIndex == 3 || columnIndex == 5) && rowIndex < 16) { //ZONA DE PUNTOS NEGRITA
            component.setFont(component.getFont().deriveFont(Font.BOLD));
        }
        
        if(rowIndex == 1 && columnIndex != 0) { //WINNER WINNER CHICKEN DINNER
            component.setBackground(new Color(255, 255, 191));
        }
        else if(rowIndex == 2 && columnIndex != 0) { //SEGUNDO
            component.setBackground(new Color(223, 223, 223));
        }
        else if(rowIndex == 3 && columnIndex != 0) { //TERCERO
            component.setBackground(new Color(255, 223, 159));
        }
        else if(rowIndex > 3 && rowIndex < 16 && columnIndex != 0) { //PUNTOS
            component.setBackground(new Color(223, 255, 223));
        }
        else if(rowIndex > 15 && !getValueAt(rowIndex, 0).equals("Ret") && columnIndex != 0) { //FUERA DE PUNTOS
            component.setBackground(new Color(207, 207, 255));
        }
        else if(rowIndex > 15 && getValueAt(rowIndex, 0).equals("Ret") && columnIndex != 0) { //DNF
            component.setBackground(new Color(239, 207, 255));
        }
        
        return component;
    }
}
