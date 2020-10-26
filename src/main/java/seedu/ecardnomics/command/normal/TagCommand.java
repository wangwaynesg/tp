package seedu.ecardnomics.command.normal;

import seedu.ecardnomics.Ui;
import seedu.ecardnomics.deck.DeckList;

/**
 * Adds tags to existing deck.
 */
public class TagCommand extends NormalCommand {
    private int index;
    private String[] newTags;

    /** Constructor. */
    public TagCommand(DeckList decks, int index, String[] newTags) {
        super(decks);
        assert (index >= 0 && index < decks.size()) : "Index must be within range.";
        this.index = index;
        assert  (newTags.length != 0): "Tags must be provided.";
        this.newTags = newTags;
    }

    @Override
    public void execute() {
        deckList.getDeck(index).addTag(newTags);
        Ui.printTags(deckList.getDeck(index).getName(), deckList.getDeck(index).getTag());
    }
}
