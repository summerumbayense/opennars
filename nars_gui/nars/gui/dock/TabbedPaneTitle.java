/*
 * Copyright 2011 Mark McKay
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * TabbedPaneTitle.java
 *
 * Created on Jan 12, 2011, 8:06:49 AM
 */
package nars.gui.dock;

import java.awt.event.MouseEvent;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/**
 *
 * @author kitfox
 */
public class TabbedPaneTitle extends TabbedPaneTitleMax  {

    final DockingRegionTabbed dockRegion;
    

    DockingExportTransferHandler xferHandler;
    MouseEvent mouseBegin;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JButton bn_maximize;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form TabbedPaneTitle
     */
    public TabbedPaneTitle(DockingRegionTabbed tabPanel, DockingContent content) {
        super(content);
        this.dockRegion = tabPanel;
    
        //bn_maximize = new NARSwing.FAButton('\uf0de');

        initComponents();

        xferHandler = new DockingExportTransferHandler(tabPanel, content);
        setTransferHandler(xferHandler);

//        JList  list = null;
//        list.setDragEnabled(true);
    }

//    DraggingOverlayPanel panel = new DraggingOverlayPanel();
//
//    public void startDrag()
//    {
//        JRootPane rootPane = getRootPane();
////        JComponent curGlass = (JComponent)rootPane.getGlassPane();
////
////        curGlass.setLayout(new BorderLayout());
////        curGlass.removeAll();
////        curGlass.add(new DraggingOverlayPanel(), BorderLayout.CENTER);
////
//
//        rootPane.setGlassPane(panel);
//        panel.setVisible(true);
////        rootPane.revalidate();
//        repaint();
//    }
//
//    public void endDrag()
//    {
//        panel.setVisible(false);
//        repaint();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    @SuppressWarnings(value = "unchecked")
    private void initComponents() {

        setOpaque(false);
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_title.setText("jLabel1");
        label_title.setBorder(createEmptyBorder(0, 0, 0, 4));
        label_title.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_titleMouseClicked(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_titleMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label_titleMouseReleased(evt);
            }
        });
        label_title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                label_titleMouseDragged(evt);
            }
        });
        bn_float.setBorderPainted(false);
        bn_float.setContentAreaFilled(false);
        bn_float.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bn_float.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_floatActionPerformed(evt);
            }
        });
        add(bn_float);
        add(label_title);
        

////bn_maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximize.png"))); // NOI18N
//        bn_maximize.setBorderPainted(false);
//        bn_maximize.setContentAreaFilled(false);
//        bn_maximize.setMargin(new java.awt.Insets(0, 0, 0, 0));
//        bn_maximize.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                bn_maximizeActionPerformed(evt);
//            }
//        });
//        add(bn_maximize);
//        //bn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
//        bn_minimize.setBorderPainted(false);
//        bn_minimize.setContentAreaFilled(false);
//        bn_minimize.setMargin(new java.awt.Insets(0, 0, 0, 0));
//        bn_minimize.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                bn_minimizeActionPerformed(evt);
//            }
//        });
//        add(bn_minimize);
        //bn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        bn_close.setBorderPainted(false);
        bn_close.setContentAreaFilled(false);
        bn_close.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bn_close.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_closeActionPerformed(evt);
            }
        });
        add(bn_close);
    } // </editor-fold>//GEN-END:initComponents

    private void bn_floatActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bn_floatActionPerformed
        {
        //GEN-HEADEREND:event_bn_floatActionPerformed
        dockRegion.floatTab(content);
    } //GEN-LAST:event_bn_floatActionPerformed

    private void bn_maximizeActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bn_maximizeActionPerformed
        {
        //GEN-HEADEREND:event_bn_maximizeActionPerformed
        dockRegion.maximizeTab(content);
    } //GEN-LAST:event_bn_maximizeActionPerformed

    private void bn_minimizeActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bn_minimizeActionPerformed
        {
        //GEN-HEADEREND:event_bn_minimizeActionPerformed
        dockRegion.minimizeTab(content);
    } //GEN-LAST:event_bn_minimizeActionPerformed

    private void bn_closeActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bn_closeActionPerformed
        {
        //GEN-HEADEREND:event_bn_closeActionPerformed
        dockRegion.removeTab(content);
    } //GEN-LAST:event_bn_closeActionPerformed

    private void label_titleMouseDragged(java.awt.event.MouseEvent evt) //GEN-FIRST:event_label_titleMouseDragged
    {
        //GEN-HEADEREND:event_label_titleMouseDragged
//        System.err.println("Dragging " + evt);
//
        int dx = mouseBegin.getX() - evt.getX();
        int dy = mouseBegin.getY() - evt.getY();
        if (mouseBegin != null && (dx * dx + dy * dy) > 16) {
//System.err.println("Export start");
            //startDrag();
            xferHandler.exportAsDrag(this, mouseBegin, TransferHandler.MOVE);
            mouseBegin = null;
        }
//        getRootPane().repaint();
    } //GEN-LAST:event_label_titleMouseDragged

    private void label_titleMouseClicked(java.awt.event.MouseEvent evt) //GEN-FIRST:event_label_titleMouseClicked
        {
        //GEN-HEADEREND:event_label_titleMouseClicked
        dockRegion.selectTab(content);
    } //GEN-LAST:event_label_titleMouseClicked

    private void label_titleMousePressed(java.awt.event.MouseEvent evt) //GEN-FIRST:event_label_titleMousePressed
    {
        //GEN-HEADEREND:event_label_titleMousePressed
        //      System.err.println("Press");

        mouseBegin = evt;
    } //GEN-LAST:event_label_titleMousePressed

    private void label_titleMouseReleased(java.awt.event.MouseEvent evt) //GEN-FIRST:event_label_titleMouseReleased
    {
        //GEN-HEADEREND:event_label_titleMouseReleased
//        System.err.println("Released");
//
        mouseBegin = null;
//        if (mouseBegin != null)
//        {
//System.err.println("Export end");
//            mouseBegin = null;
////            endDrag();
//        }
    } //GEN-LAST:event_label_titleMouseReleased

    public JLabel getLabel() {
        return label_title;
    }
    public void setLabel(String text) {
        label_title.setText(text);
    }

    
    
}
