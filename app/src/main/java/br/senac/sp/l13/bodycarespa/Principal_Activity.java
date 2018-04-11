package br.senac.sp.l13.bodycarespa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Principal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);
    }

    public void QuickClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Quick_Activity.class);
        startActivity(intent);
    }

    public void AuriculoClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Auriculo_Activity.class);
        startActivity(intent);
    }

    public void VentosaClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Ventosa_Activity.class);
        startActivity(intent);
    }

    public void ReflexologiaClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Reflexologia_Activity.class);
        startActivity(intent);
    }

    public void DoinClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Doin_Activity.class);
        startActivity(intent);
    }

    public void AgendarClick(View view) {
        Intent intent = new Intent(Principal_Activity.this,Agendar_Activity.class);
        startActivity(intent);
    }

    public void ContatoClick(View view) {
        Toast.makeText(Principal_Activity.this,"In construction",Toast.LENGTH_SHORT).show();
    }
}
