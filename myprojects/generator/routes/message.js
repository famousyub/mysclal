var express = require('express');
var router = express.Router();


router.post('/', function (req, res, next) {
    channel.sendToQueue(queue, new Buffer.from(req.body.message));
    res.render('index', { response: `Successfully sent: ${req.body.message}` });
  });


  module.exports = router;