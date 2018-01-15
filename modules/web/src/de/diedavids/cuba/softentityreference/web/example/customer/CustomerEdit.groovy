package de.diedavids.cuba.softentityreference.web.example.customer

import com.haulmont.cuba.gui.components.AbstractEditor
import de.diedavids.cuba.softentityreference.example.Comment
import de.diedavids.cuba.softentityreference.example.Customer
import de.diedavids.cuba.softentityreference.example.service.CommentsService

import javax.inject.Inject

class CustomerEdit extends AbstractEditor<Customer> {


    @Inject
    CommentsService commentsService

    void createComment() {
        Comment comment = commentsService.createComment("test", getItem())
        showNotification("Comment " + comment.id + " created...")
    }
}