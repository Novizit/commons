package com.novizit.util.pdf;

import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class PDFGenerator {

    PDDocument document;
    PDPageContentStream contentStream;
    
    public PDFGenerator(PDDocument document, PDPageContentStream contentStream) {
        this.document = document;
        this.contentStream = contentStream;
    }

    public void addSingleLineText(String text, int xPosition, int yPosition, PDFont font, float fontSize, Color color) throws IOException {
        contentStream.beginText();
        contentStream.setFont(font, fontSize);
        contentStream.setNonStrokingColor(color);
        contentStream.newLineAtOffset(xPosition, yPosition);
        contentStream.showText(text);
        contentStream.endText();
        contentStream.moveTo(0, 0);
    }
    
    public void addMultiline(String [] textArray, float leading, int xPosition, int yPosition, PDFont font, float fontSize, Color color) throws IOException {
        contentStream.beginText();
        contentStream.setFont(font, fontSize);
        contentStream.setNonStrokingColor(color);
        contentStream.setLeading(leading);
        contentStream.newLineAtOffset(xPosition,yPosition);
        
        for(String s : textArray) {
            contentStream.showText(s);
            contentStream.newLine();
        }
        contentStream.endText();
        contentStream.moveTo(0, 0);
    }
    
    public float getTextWidth(String text, PDFont font, float fontSize) throws IOException {
        return font.getStringWidth(text)/1000 * fontSize;
    }
    
    public void generateHeader(String image) throws IOException {
        PDImageXObject headImage = PDImageXObject.createFromFile(image, document);
        contentStream.drawImage(headImage, null);
    }
    
    public void drawLine(int xMoveTo, int yMoveTo, int xLineTo, int yLineTo) throws IOException {
        // LINE
        contentStream.setStrokingColor(Color.LIGHT_GRAY);
        contentStream.setLineWidth(0.5f);
        contentStream.moveTo(xMoveTo,yMoveTo);
        contentStream.lineTo(xLineTo,yMoveTo);
        contentStream.stroke();
    }
}
