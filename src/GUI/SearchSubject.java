/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.QLHP;
import static App.QLHP.stringSubjectID;
import Object.Subject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SearchSubject extends javax.swing.JFrame {

    /**
     * Creates new form QLHP
     */
    QLHP subjectApp = new QLHP();
    ArrayList<Subject> listSubject = subjectApp.loadFileHP();

    public SearchSubject() {
        initComponents();
        //showSubjectList(listSubject);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textMaHP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textTenHP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textHPTQ = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        selectSchool = new javax.swing.JComboBox<>();
        selectSoTC = new javax.swing.JComboBox<>();
        selectKiHoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        selectTypeEdu = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Subject = new javax.swing.JTable();
        btnSearchByID = new javax.swing.JButton();
        btnSearchByName = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý học phần");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Mã HP");

        textMaHP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMaHPMouseReleased(evt);
            }
        });
        textMaHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMaHPKeyPressed(evt);
            }
        });

        jLabel2.setText("Tên HP");

        textTenHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTenHPKeyPressed(evt);
            }
        });

        jLabel3.setText("Viện đào tạo");

        jLabel4.setText("Số tín chỉ HP");

        jLabel5.setText("Học phần tiên quyết");

        jLabel6.setText("Kì học");

        selectSchool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viện Công nghệ thông tin và truyền thông", "Viện Dệt may", "Viện Cơ khí", "Viện Vật lý kĩ thuật", "Viện Điện", "Viện Điện tử Viễn thông", "Viện Ngoại Ngữ", "Viện Đào tạo Quốc tế", "Viện Kinh tế và quản lý", " " }));

        selectSoTC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        selectKiHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel7.setText("Loại hình đào tạo");

        selectTypeEdu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tín chỉ", "Niên chế" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSchool, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textHPTQ)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(textMaHP))
                    .addComponent(textTenHP)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectSoTC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectKiHoc, 0, 87, Short.MAX_VALUE)
                            .addComponent(selectTypeEdu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectSoTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textHPTQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectKiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(selectTypeEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách học phần", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        table_Subject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HP", "Tên HP", "Viện đào tạo", "Số tín chỉ", "HP tiên quyết", "Kì học", "Đào tạo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_SubjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Subject);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnSearchByID.setText("Tìm kiếm theo ID");
        btnSearchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByIDActionPerformed(evt);
            }
        });

        btnSearchByName.setText("Tìm kiếm theo tên HP");
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnSearchByID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchByName)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByID)
                    .addComponent(btnSearchByName))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //when click a row in table, row's info display in detail info 
    private void table_SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_SubjectMouseClicked
        // TODO add your handling code here:
        int index = table_Subject.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) table_Subject.getModel();
        textMaHP.setText(tableModel.getValueAt(index, 0).toString());
        textTenHP.setText(tableModel.getValueAt(index, 1).toString());
        String school = tableModel.getValueAt(index, 2).toString();
        switch (school) {
            case "Viện Công nghệ thông tin và truyền thông": {
                selectSchool.setSelectedIndex(0);
            }
            break;
            case "Viện Dệt may": {
                selectSchool.setSelectedIndex(1);
            }
            break;
            case "Viện Cơ khí": {
                selectSchool.setSelectedIndex(2);
            }
            break;
            case "Viện Vật lý kĩ thuật": {
                selectSchool.setSelectedIndex(3);
            }
            break;
            case "Viện Điện": {
                selectSchool.setSelectedIndex(4);
            }
            break;
            case "Viện Điện tử Viễn thông": {
                selectSchool.setSelectedIndex(5);
            }
            break;
            case "Viện Ngoại Ngữ": {
                selectSchool.setSelectedIndex(6);
            }
            break;
            case "Viện Đào tạo Quốc tế": {
                selectSchool.setSelectedIndex(7);
            }
            break;
            case "Viện Kinh tế và quản lý": {
                selectSchool.setSelectedIndex(8);
            }
            break;
        }
        String TC = tableModel.getValueAt(index, 3).toString();
        switch (TC) {
            case "1": {
                selectSoTC.setSelectedIndex(0);
            }
            break;
            case "2": {
                selectSoTC.setSelectedIndex(1);
            }
            break;
            case "3": {
                selectSoTC.setSelectedIndex(2);
            }
            break;
            case "4": {
                selectSoTC.setSelectedIndex(3);
            }
            break;
            case "5": {
                selectSoTC.setSelectedIndex(4);
            }
            break;
        }
        textHPTQ.setText(tableModel.getValueAt(index, 4).toString());
        String kiHoc = tableModel.getValueAt(index, 5).toString();
        switch (kiHoc) {
            case "1": {
                selectKiHoc.setSelectedIndex(0);
            }
            break;
            case "2": {
                selectKiHoc.setSelectedIndex(1);
            }
            break;
            case "3": {
                selectKiHoc.setSelectedIndex(2);
            }
            break;
            case "4": {
                selectKiHoc.setSelectedIndex(3);
            }
            break;
            case "5": {
                selectKiHoc.setSelectedIndex(4);
            }
            break;
            case "6": {
                selectKiHoc.setSelectedIndex(5);
            }
            break;
            case "7": {
                selectKiHoc.setSelectedIndex(6);
            }
            break;
            case "8": {
                selectKiHoc.setSelectedIndex(7);
            }
            break;
            case "9": {
                selectKiHoc.setSelectedIndex(8);
            }
            break;
            case "10": {
                selectKiHoc.setSelectedIndex(9);
            }
            break;
        }
        String kieuDT = tableModel.getValueAt(index, 6).toString();
        if (kieuDT.equalsIgnoreCase("Tín chỉ")) {
            selectTypeEdu.setSelectedIndex(0);
        } else {
            selectTypeEdu.setSelectedIndex(1);
        }
    }//GEN-LAST:event_table_SubjectMouseClicked

    //when click button Tìm kiếm theo ID > execute search and announce
    private void btnSearchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByIDActionPerformed
        int index = subjectApp.searchSubjectByID(textMaHP.getText());
        if (index == -2 || index == -1) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy học phần có ID vừa nhập", "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel tableModel = (DefaultTableModel) table_Subject.getModel();
            int lines = tableModel.getRowCount();
            while (lines > 0) {
                tableModel.removeRow(lines - 1);
                lines--;
            }
            Object[] row = new Object[7];

            row[0] = listSubject.get(index).getIdSubject();
            //row[1] = listSearch.get(i).getPassword();
            row[1] = listSubject.get(index).getNameSubject();
            row[2] = listSubject.get(index).getSchoolSubject();
            row[4] = listSubject.get(index).getPreSubject();
            row[3] = listSubject.get(index).getSoTC();
            row[5] = listSubject.get(index).getSemester();
            row[6] = listSubject.get(index).getTypeOfEdu();
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_btnSearchByIDActionPerformed

    //when click button Tìm kiếm theo tên HP > execute search and announce
    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed

        if (subjectApp.searchSubjectByName(textTenHP.getText()) == "null") {
            JOptionPane.showMessageDialog(null, "Tên học phần không được để trống" + textTenHP.getText(), "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel tableModel = (DefaultTableModel) table_Subject.getModel();
            String arr[] = stringSubjectID.split("\t");
            int lines = tableModel.getRowCount();
            while (lines > 0) {
                tableModel.removeRow(lines - 1);
                lines--;
            }
            Object[] row;
            for (int i = 0; i < arr.length; i++) {
                int index = Integer.parseInt(arr[i]);
                row = new Object[7];
                row[0] = listSubject.get(index).getIdSubject().toString();
                row[1] = listSubject.get(index).getNameSubject().toString();
                row[2] = listSubject.get(index).getSchoolSubject().toString();
                row[3] = listSubject.get(index).getSoTC().toString();
                row[4] = listSubject.get(index).getPreSubject().toString();
                row[5] = listSubject.get(index).getSemester().toString();
                row[6] = listSubject.get(index).getTypeOfEdu().toString();
                tableModel.addRow(row);
            }
        }
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void textMaHPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMaHPMouseReleased
        textMaHP.getKeyListeners();
    }//GEN-LAST:event_textMaHPMouseReleased

    private void textMaHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaHPKeyPressed
        textMaHP.setText(textMaHP.getText());
    }//GEN-LAST:event_textMaHPKeyPressed

    private void textTenHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTenHPKeyPressed
        textTenHP.setText(textTenHP.getText());
    }//GEN-LAST:event_textTenHPKeyPressed

    //show list subject from arraylist to table in frame
    public void showSubjectList(ArrayList<Subject> listSubject) {
        DefaultTableModel model = (DefaultTableModel) table_Subject.getModel();
        Object[] row;
        for (int i = 0; i < listSubject.size(); i++) {
            row = new Object[7];
            row[0] = listSubject.get(i).getIdSubject();
            row[1] = listSubject.get(i).getNameSubject();
            row[2] = listSubject.get(i).getSchoolSubject();
            row[3] = listSubject.get(i).getSoTC();
            row[4] = listSubject.get(i).getPreSubject();
            row[5] = listSubject.get(i).getSemester();
            row[6] = listSubject.get(i).getTypeOfEdu();
            model.addRow(row);
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SearchSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SearchSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SearchSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SearchSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SearchSubject().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchByID;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> selectKiHoc;
    private javax.swing.JComboBox<String> selectSchool;
    private javax.swing.JComboBox<String> selectSoTC;
    private javax.swing.JComboBox<String> selectTypeEdu;
    private javax.swing.JTable table_Subject;
    private javax.swing.JTextField textHPTQ;
    private javax.swing.JTextField textMaHP;
    private javax.swing.JTextField textTenHP;
    // End of variables declaration//GEN-END:variables

}
