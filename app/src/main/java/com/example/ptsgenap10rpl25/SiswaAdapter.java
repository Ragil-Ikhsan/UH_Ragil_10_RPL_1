package com.example.ptsgenap10rpl25;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder> {

    private List<Siswa> DaftarNamaSiswa;
            private Context context;

    public SiswaAdapter(Context context, List<Siswa> Budi){
        DaftarNamaSiswa = Budi;
        this.context = context;
    }

    @NonNull
    @Override
    public SiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.tampilan_siswa,parent,false);
        return new SiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiswaViewHolder holder, int position) {
        holder.getNamaSiswa().setText(DaftarNamaSiswa.get(position).getName());
        holder.getNoHP().setText(DaftarNamaSiswa.get(position).getNohp());
        holder.getNIK().setText(DaftarNamaSiswa.get(position).getNik());
        holder.getAlamat().setText(DaftarNamaSiswa.get(position).getAlamat());
    }


    @Override
    public int getItemCount() {
        return DaftarNamaSiswa.size();
    }

    public class SiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView NamaSiswa,NIK,Alamat,NoHP;

        public SiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            NamaSiswa = itemView.findViewById(R.id.nama);
            NoHP = itemView.findViewById(R.id.nohp);
            NIK = itemView.findViewById(R.id.nik);
            Alamat = itemView.findViewById(R.id.alamat);

        }

        public TextView getNamaSiswa() {
            return NamaSiswa;
        }

        public TextView getNoHP() {
            return NoHP;
        }

        public TextView getAlamat() {
            return Alamat;
        }

        public TextView getNIK() {
            return NIK;
        }
    }
}
