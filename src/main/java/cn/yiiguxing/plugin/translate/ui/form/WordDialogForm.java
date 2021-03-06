package cn.yiiguxing.plugin.translate.ui.form;

import cn.yiiguxing.plugin.translate.ui.TTSButton;
import cn.yiiguxing.plugin.translate.ui.Viewer;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Word of the day dialog form
 * <p>
 * Created by Yii.Guxing on 2019/08/19.
 */
public class WordDialogForm extends DialogWrapper {

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 160;

    private JPanel rootPanel;
    protected Viewer wordView;
    protected TTSButton ttsButton;
    protected JPanel explainsCard;
    protected JPanel maskPanel;
    protected Viewer explanationView;
    protected JButton showExplanationButton;
    protected JLabel explanationLabel;

    protected WordDialogForm(@Nullable Project project) {
        super(project);

        wordView.setBorder(null);
        WordFormUtil.setRootPanelStyle(rootPanel, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        WordFormUtil.setExplanationPaneBorder(explanationView);
        WordFormUtil.setFonts(wordView, ttsButton, explanationView);
    }

    private void createUIComponents() {
        wordView = new Viewer();
        explanationView = new Viewer();
        ttsButton = new TTSButton();
    }

    @NotNull
    @Override
    protected DialogStyle getStyle() {
        return DialogStyle.COMPACT;
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return rootPanel;
    }

}
