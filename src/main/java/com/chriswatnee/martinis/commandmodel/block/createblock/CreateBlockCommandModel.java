/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chriswatnee.martinis.commandmodel.block.createblock;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author chris
 */
public class CreateBlockCommandModel {
    
    @NotEmpty(message = "You must supply a value for Content.")
    private String content;
    
    private Integer personId;
    private Integer sceneId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }
    
}
