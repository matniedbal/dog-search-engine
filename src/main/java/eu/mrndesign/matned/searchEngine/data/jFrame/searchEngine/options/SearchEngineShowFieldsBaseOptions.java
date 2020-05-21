package eu.mrndesign.matned.searchEngine.data.jFrame.searchEngine.options;

import eu.mrndesign.matned.searchEngine.data.jFrame.searchEngine.options.optionsObject.OptionsInterface;
import eu.mrndesign.matned.searchEngine.data.jFrame.searchEngine.options.optionsObject.Select;
import eu.mrndesign.matned.searchEngine.data.mediator.AdvancedSearchOption;
import eu.mrndesign.matned.searchEngine.data.mediator.DataMediator;
import eu.mrndesign.matned.searchEngine.data.jFrame.searchEngine.SearchEngineScreen;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class SearchEngineShowFieldsBaseOptions implements Options {

    private JPanel panel;


    private List<AdvancedSearchOption> fields;
    private List<OptionsInterface> options;
    private  int counter;

    public List<OptionsInterface> getOptions() {
        return options;
    }



    public SearchEngineShowFieldsBaseOptions(SearchEngineScreen screen) {
        this.panel = screen.getSelectOptions();
        fields = new LinkedList<>(new DataMediator(screen.getChoice()).getListedOptions());
        options = new LinkedList<>();
        counter = 0;
    }


    @Override
    public void make() {
        for (AdvancedSearchOption el : fields) {
            options.add(new Select(el.getFieldName()));
            panel.add(new JLabel(el.getFieldName()));
            panel.add(options.get(counter).getFirst());
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            counter++;
        }
    }
}
