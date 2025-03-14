package il.co.galex.namethatcolor.plugin.util

import com.intellij.codeInsight.completion.CompletionUtilCore
import com.intellij.patterns.XmlPatterns
import com.intellij.psi.xml.XmlTag
import com.intellij.psi.xml.XmlToken

const val NAME_THAT_COLOR = "Name that color"
const val NAME_THAT_MATERIAL_COLOR = "Name that material color"
const val NAME_7_SEVEN_BRIGHT_SHADES = "Name 7 bright shades"
const val NAME_7_SEVEN_DARK_SHADES = "Name 7 dark shades"

const val COLOR_ANNOTATION_MESSAGE = "Convert this automatically to an XML color tag named from a large set of colors"
const val MATERIAL_COLOR_ANNOTATION_MESSAGE = "Convert this automatically to an XML color tag named as a Material Color"

const val XML_ALPHA_SEPARATOR = "_alpha_"
const val KOTLIN_ALPHA_SEPARATOR = "_"

const val RESOURCES_TAG_NAME = "resources"

val PLACE = XmlPatterns.psiElement(XmlToken::class.java)
    .withText(CompletionUtilCore.DUMMY_IDENTIFIER_TRIMMED)
    .withParent(
        XmlPatterns.xmlText()
            .withParent(
                XmlPatterns.psiElement(XmlTag::class.java)
                    .withName(RESOURCES_TAG_NAME)
            )
    )
