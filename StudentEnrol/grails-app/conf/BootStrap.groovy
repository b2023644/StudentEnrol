import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
		
		def course1= new Course( title:'Interactive Media with Animation',
					department:'Computing',
					description:''' lorem ipsum....''',
					leader:'Joe Jojo',
					code: 'IMA101',
					startDate: new Date('19/01/2015'),
					endDate: new Date('19/01/2020'))

	if(!course1.save()){
			course1.errors.allErrors.each{ error ->
		println "An error occurred whilst creating course1:${error}"
		}
    }
    }
    def destroy = {
    }
}
