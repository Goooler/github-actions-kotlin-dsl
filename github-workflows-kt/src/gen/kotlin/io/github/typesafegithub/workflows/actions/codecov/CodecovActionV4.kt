// This file was generated using action-binding-generator. Don't change it by hand, otherwise your
// changes will be overwritten with the next binding code regeneration.
// See https://github.com/typesafegithub/github-workflows-kt for more info.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

package io.github.typesafegithub.workflows.actions.codecov

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Codecov
 *
 * GitHub Action that uploads coverage reports for your repository to codecov.io
 *
 * [Action on GitHub](https://github.com/codecov/codecov-action)
 *
 * @param token Repository upload token - get it from codecov.io. Required only for private
 * repositories
 * @param codecovYmlPath Specify the path to the Codecov YML
 * @param commitParent Override to specify the parent commit SHA
 * @param directory Directory to search for coverage reports.
 * @param disableSearch Disable search for coverage files. This is helpful when specifying what
 * files you want to upload with the --file option.
 * @param disableFileFixes Disable file fixes to ignore common lines from coverage (e.g. blank lines
 * or empty brackets)
 * @param dryRun Don't upload files to Codecov
 * @param envVars Environment variables to tag the upload with (e.g. PYTHON | OS,PYTHON)
 * @param exclude Folders to exclude from search
 * @param failCiIfError Specify whether or not CI build should fail if Codecov runs into an error
 * during upload
 * @param file Path to coverage file to upload
 * @param files Comma-separated list of files to upload
 * @param flags Flag upload to group coverage metrics (e.g. unittests | integration | ui,chrome)
 * @param handleNoReportsFound Raise no exceptions when no coverage reports found
 * @param jobCode The job code
 * @param name User defined upload name. Visible in Codecov UI
 * @param os Override the assumed OS. Options are linux | macos | windows.
 * @param overrideBranch Specify the branch name
 * @param overrideBuild Specify the build number
 * @param overrideBuildUrl The URL of the build where this is running
 * @param overrideCommit Specify the commit SHA
 * @param overridePr Specify the pull request number
 * @param plugin plugins to run. Options: xcode, gcov, pycoverage. The default behavior runs them
 * all.
 * @param plugins Comma-separated list of plugins for use during upload.
 * @param reportCode The code of the report. If unsure, do not include
 * @param rootDir Used when not in git/hg project to identify project root directory
 * @param slug Specify the slug manually (Enterprise use)
 * @param url Specify the base url to upload (Enterprise use)
 * @param useLegacyUploadEndpoint Use the legacy upload endpoint
 * @param verbose Specify whether the Codecov output should be verbose
 * @param version Specify which version of the Codecov CLI should be used. Defaults to `latest`
 * @param workingDirectory Directory in which to execute codecov.sh
 * @param _customInputs Type-unsafe map where you can put any inputs that are not yet supported by
 * the binding
 * @param _customVersion Allows overriding action's version, for example to use a specific minor
 * version, or a newer version that the binding doesn't yet know about
 */
public data class CodecovActionV4 private constructor(
    /**
     * Repository upload token - get it from codecov.io. Required only for private repositories
     */
    public val token: String? = null,
    /**
     * Specify the path to the Codecov YML
     */
    public val codecovYmlPath: String? = null,
    /**
     * Override to specify the parent commit SHA
     */
    public val commitParent: String? = null,
    /**
     * Directory to search for coverage reports.
     */
    public val directory: String? = null,
    /**
     * Disable search for coverage files. This is helpful when specifying what files you want to
     * upload with the --file option.
     */
    public val disableSearch: Boolean? = null,
    /**
     * Disable file fixes to ignore common lines from coverage (e.g. blank lines or empty brackets)
     */
    public val disableFileFixes: Boolean? = null,
    /**
     * Don't upload files to Codecov
     */
    public val dryRun: Boolean? = null,
    /**
     * Environment variables to tag the upload with (e.g. PYTHON | OS,PYTHON)
     */
    public val envVars: List<String>? = null,
    /**
     * Folders to exclude from search
     */
    public val exclude: List<String>? = null,
    /**
     * Specify whether or not CI build should fail if Codecov runs into an error during upload
     */
    public val failCiIfError: Boolean? = null,
    /**
     * Path to coverage file to upload
     */
    public val `file`: String? = null,
    /**
     * Comma-separated list of files to upload
     */
    public val files: List<String>? = null,
    /**
     * Flag upload to group coverage metrics (e.g. unittests | integration | ui,chrome)
     */
    public val flags: List<String>? = null,
    /**
     * Raise no exceptions when no coverage reports found
     */
    public val handleNoReportsFound: Boolean? = null,
    /**
     * The job code
     */
    public val jobCode: String? = null,
    /**
     * User defined upload name. Visible in Codecov UI
     */
    public val name: String? = null,
    /**
     * Override the assumed OS. Options are linux | macos | windows.
     */
    public val os: CodecovActionV4.OperatingSystem? = null,
    /**
     * Specify the branch name
     */
    public val overrideBranch: String? = null,
    /**
     * Specify the build number
     */
    public val overrideBuild: String? = null,
    /**
     * The URL of the build where this is running
     */
    public val overrideBuildUrl: String? = null,
    /**
     * Specify the commit SHA
     */
    public val overrideCommit: String? = null,
    /**
     * Specify the pull request number
     */
    public val overridePr: Int? = null,
    /**
     * plugins to run. Options: xcode, gcov, pycoverage. The default behavior runs them all.
     */
    public val plugin: List<CodecovActionV4.Plugin>? = null,
    /**
     * Comma-separated list of plugins for use during upload.
     */
    public val plugins: List<CodecovActionV4.Plugin>? = null,
    /**
     * The code of the report. If unsure, do not include
     */
    public val reportCode: String? = null,
    /**
     * Used when not in git/hg project to identify project root directory
     */
    public val rootDir: String? = null,
    /**
     * Specify the slug manually (Enterprise use)
     */
    public val slug: String? = null,
    /**
     * Specify the base url to upload (Enterprise use)
     */
    public val url: String? = null,
    /**
     * Use the legacy upload endpoint
     */
    public val useLegacyUploadEndpoint: Boolean? = null,
    /**
     * Specify whether the Codecov output should be verbose
     */
    public val verbose: Boolean? = null,
    /**
     * Specify which version of the Codecov CLI should be used. Defaults to `latest`
     */
    public val version: String? = null,
    /**
     * Directory in which to execute codecov.sh
     */
    public val workingDirectory: String? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<Action.Outputs>("codecov", "codecov-action", _customVersion ?: "v4") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        token: String? = null,
        codecovYmlPath: String? = null,
        commitParent: String? = null,
        directory: String? = null,
        disableSearch: Boolean? = null,
        disableFileFixes: Boolean? = null,
        dryRun: Boolean? = null,
        envVars: List<String>? = null,
        exclude: List<String>? = null,
        failCiIfError: Boolean? = null,
        `file`: String? = null,
        files: List<String>? = null,
        flags: List<String>? = null,
        handleNoReportsFound: Boolean? = null,
        jobCode: String? = null,
        name: String? = null,
        os: CodecovActionV4.OperatingSystem? = null,
        overrideBranch: String? = null,
        overrideBuild: String? = null,
        overrideBuildUrl: String? = null,
        overrideCommit: String? = null,
        overridePr: Int? = null,
        plugin: List<CodecovActionV4.Plugin>? = null,
        plugins: List<CodecovActionV4.Plugin>? = null,
        reportCode: String? = null,
        rootDir: String? = null,
        slug: String? = null,
        url: String? = null,
        useLegacyUploadEndpoint: Boolean? = null,
        verbose: Boolean? = null,
        version: String? = null,
        workingDirectory: String? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(token=token, codecovYmlPath=codecovYmlPath, commitParent=commitParent,
            directory=directory, disableSearch=disableSearch, disableFileFixes=disableFileFixes,
            dryRun=dryRun, envVars=envVars, exclude=exclude, failCiIfError=failCiIfError,
            `file`=`file`, files=files, flags=flags, handleNoReportsFound=handleNoReportsFound,
            jobCode=jobCode, name=name, os=os, overrideBranch=overrideBranch,
            overrideBuild=overrideBuild, overrideBuildUrl=overrideBuildUrl,
            overrideCommit=overrideCommit, overridePr=overridePr, plugin=plugin, plugins=plugins,
            reportCode=reportCode, rootDir=rootDir, slug=slug, url=url,
            useLegacyUploadEndpoint=useLegacyUploadEndpoint, verbose=verbose, version=version,
            workingDirectory=workingDirectory, _customInputs=_customInputs,
            _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            token?.let { "token" to it },
            codecovYmlPath?.let { "codecov_yml_path" to it },
            commitParent?.let { "commit_parent" to it },
            directory?.let { "directory" to it },
            disableSearch?.let { "disable_search" to it.toString() },
            disableFileFixes?.let { "disable_file_fixes" to it.toString() },
            dryRun?.let { "dry_run" to it.toString() },
            envVars?.let { "env_vars" to it.joinToString(",") },
            exclude?.let { "exclude" to it.joinToString(",") },
            failCiIfError?.let { "fail_ci_if_error" to it.toString() },
            `file`?.let { "file" to it },
            files?.let { "files" to it.joinToString(",") },
            flags?.let { "flags" to it.joinToString(",") },
            handleNoReportsFound?.let { "handle_no_reports_found" to it.toString() },
            jobCode?.let { "job_code" to it },
            name?.let { "name" to it },
            os?.let { "os" to it.stringValue },
            overrideBranch?.let { "override_branch" to it },
            overrideBuild?.let { "override_build" to it },
            overrideBuildUrl?.let { "override_build_url" to it },
            overrideCommit?.let { "override_commit" to it },
            overridePr?.let { "override_pr" to it.toString() },
            plugin?.let { "plugin" to it.joinToString(",") { it.stringValue } },
            plugins?.let { "plugins" to it.joinToString(",") { it.stringValue } },
            reportCode?.let { "report_code" to it },
            rootDir?.let { "root_dir" to it },
            slug?.let { "slug" to it },
            url?.let { "url" to it },
            useLegacyUploadEndpoint?.let { "use_legacy_upload_endpoint" to it.toString() },
            verbose?.let { "verbose" to it.toString() },
            version?.let { "version" to it },
            workingDirectory?.let { "working-directory" to it },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Action.Outputs = Outputs(stepId)

    public sealed class OperatingSystem(
        public val stringValue: String,
    ) {
        public object Linux : CodecovActionV4.OperatingSystem("linux")

        public object Macos : CodecovActionV4.OperatingSystem("macos")

        public object Windows : CodecovActionV4.OperatingSystem("windows")

        public class Custom(
            customStringValue: String,
        ) : CodecovActionV4.OperatingSystem(customStringValue)
    }

    public sealed class Plugin(
        public val stringValue: String,
    ) {
        public object Xcode : CodecovActionV4.Plugin("xcode")

        public object Gcov : CodecovActionV4.Plugin("gcov")

        public object Pycoverage : CodecovActionV4.Plugin("pycoverage")

        public class Custom(
            customStringValue: String,
        ) : CodecovActionV4.Plugin(customStringValue)
    }
}
