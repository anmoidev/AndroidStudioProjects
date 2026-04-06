package com.example.demointent;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuB3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_b3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar toolbar = findViewById(R.id.toolbarb3);
        setSupportActionBar(toolbar);

        Button btnLogin = findViewById(R.id.btnLoginb3);
        Button btnColor = findViewById(R.id.btnColorb3);
        TextView txtShowmenu = findViewById(R.id.txtShowmenu);

        registerForContextMenu(btnColor);
        btnColor.setOnClickListener(v -> openContextMenu(v));
        btnLogin.setOnClickListener(v -> showLoginDialog());
        txtShowmenu.setOnClickListener(v -> showPopup(v));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_b3, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_colorb3, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.red)
            findViewById(R.id.main).setBackgroundColor(0xFFFF0000);
        else if (item.getItemId() == R.id.green)
            findViewById(R.id.main).setBackgroundColor(0xFF00FF00);
        else if (item.getItemId() == R.id.blue)
            findViewById(R.id.main).setBackgroundColor(0xFF0000FF);
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_findb3) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_infob3) {
            Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_addb3) {
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_updateb3) {
            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_deleteb3) {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_feedbackb3) {
            Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_helpb3) {
            Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    private void showPopup(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(item -> {
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        });
        popupMenu.show();
    }
    private  void showLoginDialog() {
        View view = getLayoutInflater().inflate(R.layout.activity_dialogb3, null);

        AlertDialog dialog = new AlertDialog.Builder(this).setView(view).create();

        Button btnUser = view.findViewById(R.id.btnUser);
        Button btnCancel = view.findViewById(R.id.btnCancel);

        btnUser.setOnClickListener(v -> {
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        btnCancel.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }
}