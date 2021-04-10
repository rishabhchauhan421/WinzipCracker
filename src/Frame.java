



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 421 Sweet Devil
 */
public class Frame extends javax.swing.JFrame {
    static String path;
    static int wordSize=1;
    static String startsWith="";
    static String endsWith="";
    
    /**
     * Creates new form Frame
     */
    public Frame() {
        setTitle("Winzip Cracker");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProcessButton = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        crackItButtin = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        startsWithJLabel = new javax.swing.JLabel();
        startsWithJTextField = new javax.swing.JTextField();
        combinationOfWordsLabel = new javax.swing.JLabel();
        combinationOfWordsSelector = new javax.swing.JSlider();
        EndsWithJLabel = new javax.swing.JLabel();
        endsWithJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addressLabel.setText("Address: ");

        addressTextField.setEditable(false);
        addressTextField.setToolTipText("");
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        crackItButtin.setText("Crack It !");
        crackItButtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackItButtinActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Logo.setText("Winzip Cracker");

        author.setText("BY- Rishabh Chauhan");

        startsWithJLabel.setText("Starts with:");

        startsWithJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                startsWithJTextFieldFocusLost(evt);
            }
        });
        startsWithJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startsWithJTextFieldActionPerformed(evt);
            }
        });

        combinationOfWordsLabel.setText("Combination of words");

        combinationOfWordsSelector.setMajorTickSpacing(1);
        combinationOfWordsSelector.setMaximum(3);
        combinationOfWordsSelector.setMinimum(1);
        combinationOfWordsSelector.setPaintLabels(true);
        combinationOfWordsSelector.setPaintTicks(true);
        combinationOfWordsSelector.setToolTipText("");
        combinationOfWordsSelector.setValue(1);
        combinationOfWordsSelector.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                combinationOfWordsSelectorStateChanged(evt);
            }
        });

        EndsWithJLabel.setText("Ends with:");

        endsWithJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                endsWithJTextFieldFocusLost(evt);
            }
        });
        endsWithJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endsWithJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProcessButtonLayout = new javax.swing.GroupLayout(ProcessButton);
        ProcessButton.setLayout(ProcessButtonLayout);
        ProcessButtonLayout.setHorizontalGroup(
            ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessButtonLayout.createSequentialGroup()
                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessButtonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessButtonLayout.createSequentialGroup()
                        .addContainerGap(513, Short.MAX_VALUE)
                        .addComponent(author))
                    .addGroup(ProcessButtonLayout.createSequentialGroup()
                        .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProcessButtonLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(addressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProcessButtonLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startsWithJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combinationOfWordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EndsWithJLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combinationOfWordsSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(startsWithJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endsWithJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ProcessButtonLayout.createSequentialGroup()
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(browseButton))))
                            .addGroup(ProcessButtonLayout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(crackItButtin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ProcessButtonLayout.setVerticalGroup(
            ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessButtonLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combinationOfWordsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combinationOfWordsSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startsWithJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startsWithJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProcessButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndsWithJLabel)
                    .addComponent(endsWithJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(crackItButtin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(author)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        startFileChoser();
    }//GEN-LAST:event_browseButtonActionPerformed
    
    public void startFileChoser(){
        FileChoser fileChoser=new FileChoser();
        addressTextField.setText(path);
    }
    
    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void crackItButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackItButtinActionPerformed
        new process();
    }//GEN-LAST:event_crackItButtinActionPerformed

    private void startsWithJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startsWithJTextFieldActionPerformed

    }//GEN-LAST:event_startsWithJTextFieldActionPerformed

    private void startsWithJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startsWithJTextFieldFocusLost
        startsWith=startsWithJTextField.getText();
    }//GEN-LAST:event_startsWithJTextFieldFocusLost

    private void combinationOfWordsSelectorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_combinationOfWordsSelectorStateChanged
        wordSize=combinationOfWordsSelector.getValue();
    }//GEN-LAST:event_combinationOfWordsSelectorStateChanged

    private void endsWithJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endsWithJTextFieldFocusLost
        endsWith=endsWithJTextField.getText();
    }//GEN-LAST:event_endsWithJTextFieldFocusLost

    private void endsWithJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endsWithJTextFieldActionPerformed
       
    }//GEN-LAST:event_endsWithJTextFieldActionPerformed
    
    public static void setTextField(){
        addressTextField.setText(path);
    }
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EndsWithJLabel;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel ProcessButton;
    private javax.swing.JLabel addressLabel;
    private static javax.swing.JTextField addressTextField;
    private javax.swing.JLabel author;
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel combinationOfWordsLabel;
    private javax.swing.JSlider combinationOfWordsSelector;
    private javax.swing.JButton crackItButtin;
    public static javax.swing.JTextField endsWithJTextField;
    private javax.swing.JLabel startsWithJLabel;
    public static javax.swing.JTextField startsWithJTextField;
    // End of variables declaration//GEN-END:variables
}