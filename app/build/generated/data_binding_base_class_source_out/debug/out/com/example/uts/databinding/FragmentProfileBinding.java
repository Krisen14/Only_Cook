// Generated by view binder compiler. Do not edit!
package com.example.uts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uts.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogout;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final Button tentangAplikasi;

  @NonNull
  public final TextView userEmail;

  @NonNull
  public final TextView userName;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogout,
      @NonNull ConstraintLayout frameLayout, @NonNull CircleImageView profileImage,
      @NonNull Button tentangAplikasi, @NonNull TextView userEmail, @NonNull TextView userName) {
    this.rootView = rootView;
    this.btnLogout = btnLogout;
    this.frameLayout = frameLayout;
    this.profileImage = profileImage;
    this.tentangAplikasi = tentangAplikasi;
    this.userEmail = userEmail;
    this.userName = userName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogout;
      Button btnLogout = ViewBindings.findChildViewById(rootView, id);
      if (btnLogout == null) {
        break missingId;
      }

      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.tentangAplikasi;
      Button tentangAplikasi = ViewBindings.findChildViewById(rootView, id);
      if (tentangAplikasi == null) {
        break missingId;
      }

      id = R.id.userEmail;
      TextView userEmail = ViewBindings.findChildViewById(rootView, id);
      if (userEmail == null) {
        break missingId;
      }

      id = R.id.userName;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, btnLogout, frameLayout,
          profileImage, tentangAplikasi, userEmail, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}