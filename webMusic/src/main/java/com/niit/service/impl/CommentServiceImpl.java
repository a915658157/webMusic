package com.niit.service.impl;

import com.niit.entity.Comment;
import com.niit.mapper.CommentMapper;
import com.niit.service.interfaces.ICommentService;
import com.niit.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private JSONUtil jsonUtil;

    @Override
    public long addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public String getMusicCommentByMid(long mid) {
        return jsonUtil.toJSon(commentMapper.getMusicCommentByMid(mid));
    }

    @Override
    public String getMusicCommentByCid(long cid) {
        return jsonUtil.toJSon(commentMapper.getMusicCommentByCid(cid));
    }
}
