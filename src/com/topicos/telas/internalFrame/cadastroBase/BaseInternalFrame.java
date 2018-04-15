package com.topicos.telas.internalFrame.cadastroBase;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;

public class BaseInternalFrame extends JInternalFrame {
    public BaseInternalFrame(){
        setClosable(true);

        setBounds(100, 100, 755, 501);
        getContentPane().setLayout(null);



    }
}
