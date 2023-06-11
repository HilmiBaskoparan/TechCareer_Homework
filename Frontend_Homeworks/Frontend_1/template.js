/*
Project Name: Full Stack Developer Blog Page
-Name: Blog Page
-Author: Hilmi Başkoparan
-Version: v.1
-Description: This project is a blog page about full stack developer.
*/

/*
function deneme(){}
let deneme = function(){}
let deneme = () =>{}
*/


// COUNTER
$(function() {
    $('[data-toggle="counter-up"]').counterUp({
        delay: 10,
        time: 1000
    });
});

// $('body').scrollspy({ target: '#navbar_second' })

// COUNTER
// $(function () {
//     $('[data-toggle="counter-up"]').counterUp({
//         delay: 10,
//         time: 1000
//     });
// });


// $(document).ready(function() {

//     var counters = $(".count");
//     var countersQuantity = counters.length;
//     var counter = [];

//     for (i = 0; i < countersQuantity; i++) {
//       counter[i] = parseInt(counters[i].innerHTML);
//     }

//     var count = function(start, value, id) {
//       var localStart = start;
//       setInterval(function() {
//         if (localStart < value) {
//           localStart++;
//           counters[id].innerHTML = localStart;
//         }
//       }, 40);
//     }

//     for (j = 0; j < countersQuantity; j++) {
//       count(0, counter[j], j);
//     }
//   });

// const scrollSpy = new bootstrap.ScrollSpy(document.body, {
//     target: '#navbar_second'
//   })




// FOR REGISTER
// $(document).ready(function() {
//     $('#contact_form').bootstrapValidator({
//         // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
//         feedbackIcons: {
//             valid: 'glyphicon glyphicon-ok',
//             invalid: 'glyphicon glyphicon-remove',
//             validating: 'glyphicon glyphicon-refresh'
//         },
//         fields: {
//             first_name: {
//                 validators: {
//                         stringLength: {
//                         min: 2,
//                     },
//                         notEmpty: {
//                         message: 'Please enter your First Name'
//                     }
//                 }
//             },
//             last_name: {
//                 validators: {
//                      stringLength: {
//                         min: 2,
//                     },
//                     notEmpty: {
//                         message: 'Please enter your Last Name'
//                     }
//                 }
//             },
// 			user_password: {
//                 validators: {
//                      stringLength: {
//                         min: 8,
//                     },
//                     notEmpty: {
//                         message: 'Please enter your Password'
//                     }
//                 }
//             },
// 			confirm_password: {
//                 validators: {
//                      stringLength: {
//                         min: 8,
//                     },
//                     notEmpty: {
//                         message: 'Please confirm your Password'
//                     }
//                 }
//             },
//             email: {
//                 validators: {
//                     notEmpty: {
//                         message: 'Please enter your Email Address'
//                     },
//                     emailAddress: {
//                         message: 'Please enter a valid Email Address'
//                     }
//                 }
//             }
//             }
//         })
//         .on('success.form.bv', function(e) {
//             $('#success_message').slideDown({ opacity: "show" }, "slow") // Do something ...
//                 $('#contact_form').data('bootstrapValidator').resetForm();

//             // Prevent form submission
//             e.preventDefault();

//             // Get the form instance
//             var $form = $(e.target);

//             // Get the BootstrapValidator instance
//             var bv = $form.data('bootstrapValidator');

//             // Use Ajax to submit form data
//             $.post($form.attr('action'), $form.serialize(), function(result) {
//                 console.log(result);
//             }, 'json');
//         });
// });