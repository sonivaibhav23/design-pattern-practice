package local.practice.designpatternpractice.builder.basicbuilder;

import java.util.ArrayList;
import java.util.Collections;

public class BasicBuilder {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "vaibhav");
        builder.addChild("li", "soni");
        System.out.println(builder);
    }
}

class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    void addChild(String name, String text) {
        HtmlElement child = new HtmlElement(name, text);
        root.elements.add(child);
    }

    void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}

class HtmlElement {

    String name, text;
    ArrayList<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    HtmlElement() {
    }

    HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent)
    {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty())
        {
            sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement e : elements)
            sb.append(e.toStringImpl(indent + 1));

        sb.append(String.format("%s</%s>%s", i, name, newLine));
        return sb.toString();
    }

    @Override
    public String toString()
    {
        return toStringImpl(0);
    }
}
