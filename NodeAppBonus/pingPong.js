const http2 = require('http2')
const { readFileSync, writeFileSync } = require('fs');
const path = './config.json';

let parsedData = JSON.parse(readFileSync(path));

const session = http2.connect(`http://${parsedData.ip}:${parsedData.port}`);

session.ping((err, duration, payload) => {
    if (!err) {
      console.log(`Ping acknowledged in ${duration} milliseconds`);
      console.log(`With payload '${payload.toString()}'`);
      parsedData.isOnline = true;
    } else {
        console.log(err);
        parsedData.isOnline = false;
    }
    writeFileSync(path, JSON.stringify(parsedData, null, 2), (err) => {
        if (err) {
          console.log('An error occurred while updating the JSON', err);
        } else {
            console.log('Updated isOnline JSON key');
        }
      });
  });