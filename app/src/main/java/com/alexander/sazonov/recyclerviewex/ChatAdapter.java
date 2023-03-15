package com.alexander.sazonov.recyclerviewex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdapter extends ListAdapter<Chat, ChatAdapter.ChatViewHolder> {
    public static final DiffUtil.ItemCallback<Chat> ITEM_CALLBACK =
            new DiffUtil.ItemCallback<Chat>() {
        @Override
        public boolean areItemsTheSame(@NonNull Chat oldItem, @NonNull Chat newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Chat oldItem, @NonNull Chat newItem) {
            return oldItem.equals(newItem);
        }
    };
    public ChatAdapter() {
        super(ITEM_CALLBACK);
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat chat = getItem(position);
        holder.bind(chat);
    }

    static class ChatViewHolder extends RecyclerView.ViewHolder {
        private ImageView chatAvatar;
        private TextView chatName;
        private TextView chatMessage;
        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            chatAvatar = itemView.findViewById(R.id.chat_avatar);
            chatName = itemView.findViewById(R.id.chat_name);
            chatMessage = itemView.findViewById(R.id.chat_message);
        }

        public void bind(Chat chat){
            chatAvatar.setImageResource(chat.getImageId());
            chatName.setText(chat.getName());
            chatMessage.setText(chat.getMessage());
        }
    }
}
