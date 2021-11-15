package com.compositeChain.entity;

import com.compositeChain.parser.ChainLevels;

import java.util.ArrayList;
import java.util.List;

public class ParagraphComponent extends AbstractComponent{
    private final static ArrayList<ParagraphComponent> PARAGRAPH_LIST = new ArrayList<ParagraphComponent>();
    public final static ChainLevels NEXT_LEVEL = ChainLevels.PARAGRAPH; // TODO возможно не final. ужно ченкуть в любом случае, ибо парсер возвращает список объектов уровня текста
    private String text;

    public ParagraphComponent(String text) {
        this.text = text;
    }

}
