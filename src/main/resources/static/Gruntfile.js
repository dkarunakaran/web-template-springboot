module.exports = function(grunt) {
  require('jit-grunt')(grunt);

  grunt.initConfig({
    less: {
      development: {
        options: {
          compress: true,
          yuicompress: true,
          optimization: 2
        },
        files: {
          "assets/css/compiled/stickyFooter.css": "assets/css/less/stickyFooter.less",
          "assets/css/compiled/navBar.css": "assets/css/less/navBar.less"
        }
      }
    },
    cssmin: {
	   dist: {
	      files: {
	         'assets/css/main.min.css': ['assets/css/compiled/*.css']
	      }
	  }
	},
    watch: {
      styles: {
        files: ['assets/css/less/*.less'], // which files to watch
        tasks: ['less'],
        options: {
          nospawn: true
        }
      }
    }
  });

  grunt.registerTask('default', ['less', 'cssmin', 'watch']);
};
