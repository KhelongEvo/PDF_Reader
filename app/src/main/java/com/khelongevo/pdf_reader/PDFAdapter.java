package com.khelongevo.pdf_reader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class PDFAdapter extends ArrayAdapter<File> {
    Context context;
    ViewHolder viewHolder;
    ArrayList<File> allPdf;

    public PDFAdapter(Context context, ArrayList<File> allPdf) {
        super(context, R.layout.pdf_view, allPdf);
        this.context = context;
        this.allPdf = allPdf;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        if(allPdf.size() > 0) {
            return allPdf.size();
        } else {
            return 1;
        }
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.pdf_view, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.fileName = convertView.findViewById(R.id.pdf_title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.fileName.setText(allPdf.get(position).getName());
        return convertView;
    }

    public class ViewHolder {
        TextView fileName;
    }


}
