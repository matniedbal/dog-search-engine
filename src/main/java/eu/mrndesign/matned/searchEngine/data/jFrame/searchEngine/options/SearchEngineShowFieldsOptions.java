package eu.mrndesign.matned.searchEngine.data.jFrame.searchEngine.options;

import java.awt.*;

public class SearchEngineShowFieldsOptions extends OptionsGrid implements Options {

    private int width;
    private int height;
    private String choice;

    public SearchEngineShowFieldsOptions(String choice) {
        this.choice = choice;
    }

    @Override
    public GridLayout grid(GridLayout grid) {
        return grid;
    }
}
