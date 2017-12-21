/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.QLHP;
import static GUI.Login.idLogin;
import static GUI.Login.infoLog;
import Object.Subject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StudentDKHP extends javax.swing.JFrame {

    /**
     * Creates new form QLHP
     */
    
    String info[] = infoLog.split("\t");
    QLHP subjectApp = new QLHP();
    ArrayList<Subject> listHPDK = subjectApp.loadHPDK(idLogin);
    ArrayList<Subject> listSubject = subjectApp.loadCTDT(info[2], info[3]);
    
    public StudentDKHP() {
        initComponents();
        showHPDKList(listHPDK);
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
        table_HPDK = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        setTitle("Đăng ký học phần");

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách học phần đăng ký", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        table_HPDK.setModel(new javax.swing.table.DefaultTableModel(
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
        table_HPDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_HPDKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_HPDK);

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

        btnAdd.setText("Thêm vào DS");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa khỏi DS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(334, 334, 334)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //when click a row in table, row's info display in detail info 
    private void table_HPDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_HPDKMouseClicked
        // TODO add your handling code here:
        int index = table_HPDK.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) table_HPDK.getModel();
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
    }//GEN-LAST:event_table_HPDKMouseClicked

    private void textMaHPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMaHPMouseReleased
        textMaHP.getKeyListeners();
    }//GEN-LAST:event_textMaHPMouseReleased

    private void textMaHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaHPKeyPressed
        textMaHP.setText(textMaHP.getText());
    }//GEN-LAST:event_textMaHPKeyPressed

    private void textTenHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTenHPKeyPressed
        textTenHP.setText(textTenHP.getText());
    }//GEN-LAST:event_textTenHPKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String subjectInfo = subjectApp.searchSubjectDKHP(textMaHP.getText());
        if (subjectInfo == "null") {
            JOptionPane.showMessageDialog(null, "Mã học phần không hợp lệ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String arr[] = subjectInfo.split("\t");
            //display in table
            DefaultTableModel tableModel = (DefaultTableModel) table_HPDK.getModel();
            tableModel.addRow(new Object[]{
                arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]});
            //add to arrayList
            Subject subject = new Subject();
            subject.setIdSubject(arr[0]);
            subject.setNameSubject(arr[1]);
            subject.setSchoolSubject(arr[2]);
            subject.setSoTC(arr[3]);
            subject.setPreSubject(arr[4]);
            subject.setSemester(arr[5]);
            subject.setTypeOfEdu(arr[6]);
            listHPDK.add(subject);
            subjectApp.removeDKHP(idLogin);
            subjectApp.saveDKHP(listHPDK, idLogin);
            JOptionPane.showMessageDialog(null, "Thao tác thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table_HPDK.getModel();
        int index = table_HPDK.getSelectedRow();
       try{
        //delete data in arraylist and file
        String idDel = table_HPDK.getValueAt(index, 0).toString();
        for (int i = 0; i < listHPDK.size(); i++) {
            if (listHPDK.get(i).getIdSubject().equalsIgnoreCase(idDel)) {
                listHPDK.remove(i);
                subjectApp.removeDKHP(idLogin);
                subjectApp.saveDKHP(listHPDK, idLogin);
                JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
         //delete data in table
        tableModel.removeRow(index);}
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Thao tác không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentPage studentPage = new StudentPage();
        studentPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //show list subject from arraylist to table in frame
    private void showHPDKList(ArrayList<Subject> listHPDK) {
        DefaultTableModel model = (DefaultTableModel) table_HPDK.getModel();
        Object[] row;
        for (int i = 0; i < listHPDK.size(); i++) {
            row = new Object[7];
            row[0] = listHPDK.get(i).getIdSubject();
            row[1] = listHPDK.get(i).getNameSubject();
            row[2] = listHPDK.get(i).getSchoolSubject();
            row[3] = listHPDK.get(i).getSoTC();
            row[4] = listHPDK.get(i).getPreSubject();
            row[5] = listHPDK.get(i).getSemester();
            row[6] = listHPDK.get(i).getTypeOfEdu();
            model.addRow(row);
            System.out.println(listHPDK.get(i).getIdSubject());
        }
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDKHP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable table_HPDK;
    private javax.swing.JTextField textHPTQ;
    private javax.swing.JTextField textMaHP;
    private javax.swing.JTextField textTenHP;
    // End of variables declaration//GEN-END:variables

}
