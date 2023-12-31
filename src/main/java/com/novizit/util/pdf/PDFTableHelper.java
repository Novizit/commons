package com.novizit.util.pdf;

import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

public class PDFTableHelper {

    PDDocument document;
    PDPageContentStream contentStream;
    private int[] colWidths;
    private int cellHeight;
    private int xPosition;
    private int yPosition;
    private int colPosition;
    private int xInitialPosition;
    private float  fontSize;
    private PDFont font;
    private Color fontColor;
    
    public PDFTableHelper(PDDocument document, PDPageContentStream contentStream) {
        this.document = document;
        this.contentStream = contentStream;
    }
    
    void setTable(int[]colWidths, int cellHeight, int xPostion, int yPosition) {
        this.colWidths = colWidths;
        this.cellHeight = cellHeight;
        this.xPosition = xPostion;
        this.yPosition = yPosition;
        xInitialPosition = xPostion;
    }
    
    void setTableFont(PDFont font, float fontSize, Color fontColor) {
        this.font = font;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
    }
    
    void addCell(String text, Color fillColor) throws IOException {
        contentStream.setStrokingColor(1f);
        if(fillColor != null) {
            contentStream.setNonStrokingColor(fontColor);
        }
        contentStream.addRect(xPosition, yPosition, colWidths[colPosition], cellHeight);
        
        if( fillColor == null) {
            contentStream.stroke();
        }
        else 
            contentStream.fillAndStroke();
        
        contentStream.beginText();
        contentStream.setNonStrokingColor(fontColor);
        
        if(colPosition == 4 || colPosition == 2) {
            float fontWidth = font.getStringWidth(text)/1000 * fontSize;
            contentStream.newLineAtOffset(xPosition + colWidths[colPosition] - 20 - fontWidth, yPosition+10);
        }
        else {
            contentStream.newLineAtOffset(xPosition + 20 , yPosition + 10);
        }
        
        contentStream.showText(text);
        contentStream.endText();
        
        xPosition = xPosition + colWidths[colPosition];
        colPosition++;
        
        if(colPosition == colWidths.length) {
            colPosition = 0;
            xPosition = xInitialPosition;
            yPosition = cellHeight;
        }
    }
}
