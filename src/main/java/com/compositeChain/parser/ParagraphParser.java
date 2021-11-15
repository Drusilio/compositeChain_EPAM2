package com.compositeChain.parser;

import com.compositeChain.entity.AbstractComponent;
import com.compositeChain.entity.ParagraphComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends ChainAbstractParser {
    private final static String PARAGHAPH_REGEX = ""; // TODO Добавить регекс абзацев
    private final static String PARAGHAPH_DILIMITER_REGEX = ""; // TODO Добавить регекс разделителя абзацев

    public List<ParagraphComponent> parse(String innerTextComponent) {
        Pattern pattern = Pattern.compile(PARAGHAPH_REGEX);
        Matcher matcher = pattern.matcher(innerTextComponent);
        List<ParagraphComponent> paragraphList = new ArrayList<>();
        while (matcher.find()) {
            String element = matcher.group();
            paragraphList.add(new ParagraphComponent(element));
        }
        return paragraphList;
    }
}
