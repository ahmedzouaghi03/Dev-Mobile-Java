import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Class2 extends StatelessWidget {
  const Class2({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.black87,
          title: const Text(
            "App Bar 2",
            style: TextStyle(color: Colors.blueAccent),
          ),
        ),
        body: Center(
          child: Container(
            padding: const EdgeInsets.all(10),
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(12),
              border: Border.all(
                color: Colors.black87,
                width: 8,
              )
            ),
            child: const Text("Hello world!",style: TextStyle(color: Colors.blueAccent),),
          ),
        ),
      ),
    );
  }
}
