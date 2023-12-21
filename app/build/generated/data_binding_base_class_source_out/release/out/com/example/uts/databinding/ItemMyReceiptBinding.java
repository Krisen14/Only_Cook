// Generated by view binder compiler. Do not edit!
package com.example.uts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uts.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMyReceiptBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView deleteButton;

  @NonNull
  public final ImageView editButton;

  @NonNull
  public final TextView receiptDate;

  @NonNull
  public final TextView receiptDesc;

  @NonNull
  public final ImageView receiptImage;

  @NonNull
  public final TextView receiptName;

  private ItemMyReceiptBinding(@NonNull CardView rootView, @NonNull ImageView deleteButton,
      @NonNull ImageView editButton, @NonNull TextView receiptDate, @NonNull TextView receiptDesc,
      @NonNull ImageView receiptImage, @NonNull TextView receiptName) {
    this.rootView = rootView;
    this.deleteButton = deleteButton;
    this.editButton = editButton;
    this.receiptDate = receiptDate;
    this.receiptDesc = receiptDesc;
    this.receiptImage = receiptImage;
    this.receiptName = receiptName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMyReceiptBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMyReceiptBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_my_receipt, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMyReceiptBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteButton;
      ImageView deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.editButton;
      ImageView editButton = ViewBindings.findChildViewById(rootView, id);
      if (editButton == null) {
        break missingId;
      }

      id = R.id.receiptDate;
      TextView receiptDate = ViewBindings.findChildViewById(rootView, id);
      if (receiptDate == null) {
        break missingId;
      }

      id = R.id.receiptDesc;
      TextView receiptDesc = ViewBindings.findChildViewById(rootView, id);
      if (receiptDesc == null) {
        break missingId;
      }

      id = R.id.receiptImage;
      ImageView receiptImage = ViewBindings.findChildViewById(rootView, id);
      if (receiptImage == null) {
        break missingId;
      }

      id = R.id.receiptName;
      TextView receiptName = ViewBindings.findChildViewById(rootView, id);
      if (receiptName == null) {
        break missingId;
      }

      return new ItemMyReceiptBinding((CardView) rootView, deleteButton, editButton, receiptDate,
          receiptDesc, receiptImage, receiptName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}